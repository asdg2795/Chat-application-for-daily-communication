package com.one.social_project.domain.chat.service;

import com.one.social_project.domain.chat.dto.ReadReceiptDTO;
import com.one.social_project.domain.chat.entity.ChatMessage;
import com.one.social_project.domain.chat.entity.ReadReceipt;
import com.one.social_project.domain.chat.repository.ReadReceiptRepository;
import com.one.social_project.domain.chat.repository.ChatMessageRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class ReadReceiptService {

    private final ChatMessageRepository chatMessageRepository;
    private final ReadReceiptRepository readReceiptRepository;

    // 메시지 읽음 상태 업데이트
    @Transactional
    public void markAsRead(String messageId, String nickName){
        // ReadReceipt 사용자 추가
        if (!readReceiptRepository.existsByMessageIdAndUserId(messageId, nickName)) {
            saveReadReceipt(messageId, nickName);
        }

        // 메시지 읽음 목록에 사용자 추가
        ChatMessage message = chatMessageRepository.findById(messageId)
                .orElseThrow(() -> new EntityNotFoundException("메시지를 찾을 수 없습니다. ID: " + messageId));

        if (!message.getReaders().contains(nickName)) { // 중복 여부 확인
            message.getReaders().add(nickName);
            chatMessageRepository.save(message);
        } else {
            log.info("이미 읽은 사용자입니다.: messageId={}, nickName={}", messageId, nickName);
        }
    }

    private void saveReadReceipt(String messageId, String userId) {
        ReadReceipt readReceipt = ReadReceipt.builder()
                .messageId(messageId)
                .userId(userId)
                .readAt(LocalDateTime.now())
                .build();
        readReceiptRepository.save(readReceipt);
    }

    // 특정 채팅방에서 지정된 사용자가 읽지 않은 메시지의 개수를 계산
    @Transactional(readOnly = true)
    public int countUnreadMessages(String roomId, String userId) {
        // 읽지 않은 메시지 필터링 및 카운팅
        return (int) chatMessageRepository.findAllByRoomId(roomId).stream()
                .filter(message -> !readReceiptRepository.existsByMessageIdAndUserId(message.getId(), userId))
                .count();
    }
}

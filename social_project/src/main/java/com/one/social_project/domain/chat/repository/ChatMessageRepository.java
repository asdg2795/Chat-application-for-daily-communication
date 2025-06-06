package com.one.social_project.domain.chat.repository;

import com.one.social_project.domain.chat.entity.ChatMessage;
import com.one.social_project.domain.search.repository.ChatMessageRepositoryCustom;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface ChatMessageRepository extends MongoRepository<ChatMessage, String>, ChatMessageRepositoryCustom {
    // 특정 채팅방의 모든 메시지를 조회
    List<ChatMessage> findAllByRoomId(String roomId);

    // 특정 채팅방에 채팅 조회 (생성 시간 기준 오름차순 정렬)
    Page<ChatMessage> findByRoomIdOrderByCreatedAtAsc(String roomId, Pageable pageable);

    // 특정 채팅방의 가장 최근 메시지 조회
    ChatMessage findFirstByRoomIdOrderByCreatedAtDesc(String roomId);

    // 특정 채팅방의 모든 메시지 삭제
    void deleteAllByRoomId(String roomId);

    // 채팅방의 읽지 않은 메시지 조회(sender가 읽지 않은 메시지)
    List<ChatMessage> findAllByRoomIdAndReadersNotContaining(String roomId, String sender);
}

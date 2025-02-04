package com.one.social_project.domain.chat.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.*;

@Configuration
@EnableWebSocket
@RequiredArgsConstructor
public class WebSocketConfig implements WebSocketConfigurer {

    private final WebSocketHandler webSocketHandler;

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        // URL에서 ROOMiD 포함(채팅방을 명확하게 구분되고, 서버에서 방을 쉽게 관리
        registry.addHandler(webSocketHandler,"/chat/{roomId}") // WebSocket 연결 엔드포인트
                .setAllowedOrigins("*");
    }
}

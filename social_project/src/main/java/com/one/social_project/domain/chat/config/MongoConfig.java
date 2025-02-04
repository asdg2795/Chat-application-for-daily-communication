package com.one.social_project.domain.chat.config;

import com.one.social_project.domain.chat.DateToLocalDateTimeKstConverter;
import com.one.social_project.domain.chat.LocalDateTimeToDateKstConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.data.mongodb.core.convert.MongoCustomConversions;


import java.util.List;

@Configuration
public class MongoConfig {

    @Value("${spring.data.mongodb.uri}")
    private String url;

    @Bean
    public MongoCustomConversions customConversions() {
        return new MongoCustomConversions(
                List.of(
                        new DateToLocalDateTimeKstConverter(), // 읽기 변환기
                        new LocalDateTimeToDateKstConverter()  // 쓰기 변환기
                )
        );
    }

    @Bean
    public MongoClient mongoClient() {
        return MongoClients.create(url);
    }

    @Bean
    public MongoTemplate mongoTemplate(MongoClient mongoClient) {
        return new MongoTemplate(mongoClient, "chat");
    }
}

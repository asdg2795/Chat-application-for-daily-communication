package com.one.social_project.domain.email.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class EmailDto {

    // 이메일 주소
    private String email;
    // 인증 코드
    private String verifyCode;
}
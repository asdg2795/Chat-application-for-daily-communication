package com.one.social_project.domain.email.repository;

import com.one.social_project.domain.email.entity.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmailRepository extends JpaRepository<Email, Long> {
    // 인증코드 발송한 이메일 주소 조회
    public Optional<Email> findByEmail(String email);
}
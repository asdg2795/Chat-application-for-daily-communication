package com.one.social_project.domain.friend.repository;

import com.one.social_project.domain.friend.entity.Friendship;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FriendshipRepository extends JpaRepository<Friendship, Long> {
}

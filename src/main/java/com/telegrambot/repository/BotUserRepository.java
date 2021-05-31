package com.telegrambot.repository;

import com.telegrambot.entity.BotUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BotUserRepository extends JpaRepository<BotUserEntity, Long> {
}

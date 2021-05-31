package com.telegrambot.repository;

import com.telegrambot.entity.BotChatEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BotChatRepository extends JpaRepository<BotChatEntity, Long> {

}

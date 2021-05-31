package com.telegrambot.repository;

import com.telegrambot.entity.MessageTemplateEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<MessageTemplateEntity, Long> {

    MessageTemplateEntity findByDescriptionAndType(String description, String type);

}

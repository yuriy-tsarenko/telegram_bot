package com.telegrambot.repository;

import org.springframework.stereotype.Repository;
import org.telegram.telegrambots.meta.api.objects.MessageEntity;
@Repository
public class MessageRepository extends  GenericRepository<MessageEntity>{
    {
        init(MessageEntity.class);
    }
}

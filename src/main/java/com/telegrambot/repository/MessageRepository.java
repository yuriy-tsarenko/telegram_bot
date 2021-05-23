package com.telegrambot.repository;

import org.telegram.telegrambots.meta.api.objects.MessageEntity;

public class MessageRepository extends  GenericRepository<MessageEntity>{
    {
        init(MessageEntity.class);
    }
}

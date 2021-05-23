package com.telegrambot.repository;

import com.telegrambot.entity.BotChatEntity;

public class CommunityRepository extends GenericRepository<BotChatEntity>{
    {
        init(BotChatEntity.class);
    }
}

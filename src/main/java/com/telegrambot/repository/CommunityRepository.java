package com.telegrambot.repository;

import com.telegrambot.entity.BotChatEntity;
import org.springframework.stereotype.Repository;

@Repository
public class CommunityRepository extends GenericRepository<BotChatEntity>{
    {
        init(BotChatEntity.class);
    }
}

package com.telegrambot.repository;

import com.telegrambot.entity.BotUserEntity;

public class BotUserRepository extends GenericRepository<BotUserEntity>{
    {
        init(BotUserEntity.class);
    }
}

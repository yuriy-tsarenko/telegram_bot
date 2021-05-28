package com.telegrambot.repository;

import com.telegrambot.entity.BotUserEntity;
import org.springframework.stereotype.Repository;

@Repository
public class BotUserRepository extends GenericRepository<BotUserEntity>{
    {
        init(BotUserEntity.class);
    }
}

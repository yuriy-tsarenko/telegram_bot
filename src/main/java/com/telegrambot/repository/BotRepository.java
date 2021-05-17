package com.telegrambot.repository;

import com.telegrambot.entity.BotEntity;

public class BotRepository extends GenericRepository<BotEntity> {
    {
        init(BotEntity.class);
    }
}

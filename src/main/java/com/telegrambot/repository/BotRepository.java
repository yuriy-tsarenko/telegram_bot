package com.telegrambot.repository;

import com.telegrambot.entity.BotEntity;
import org.springframework.stereotype.Repository;

@Repository
public class BotRepository extends GenericRepository<BotEntity> {
    {
        init(BotEntity.class);
    }
}

package com.telegrambot.mapper;

import com.telegrambot.dto.BotDto;
import com.telegrambot.entity.BotEntity;

public final class BotMapper {

    private BotMapper() {
    }

    public BotEntity mapEntityToDto(BotDto dto) {
        BotEntity botEntity = new BotEntity();
        botEntity.setBotToken(dto.getBotToken());
        return botEntity;
    }
}

package com.telegrambot.mapper;

import com.telegrambot.dto.BotDto;
import com.telegrambot.entity.BotEntity;
import org.springframework.stereotype.Component;

@Component
public final class BotMapper {

    private BotMapper() {
    }

    public BotEntity mapEntityToDto(BotDto dto) {
        BotEntity botEntity = new BotEntity();
        botEntity.setBotToken(dto.getBotToken());
        botEntity.setBotName(dto.getBotName());
        botEntity.setId(dto.getId());
        botEntity.setBaseUrl(dto.getBaseUrl());
        return botEntity;
    }
}

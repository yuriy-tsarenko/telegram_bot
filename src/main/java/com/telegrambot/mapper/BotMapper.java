package com.telegrambot.mapper;

import com.telegrambot.dto.BotDto;
import com.telegrambot.entity.BotEntity;
import org.springframework.stereotype.Component;

@Component
public final class BotMapper {

    private BotMapper() {
    }

    public BotDto mapEntityToDto(BotEntity entity) {
        BotDto dto = new BotDto();
        dto.setBotToken(entity.getBotToken());
        dto.setBotName(entity.getBotName());
        dto.setId(entity.getId());
        dto.setBaseUrl(dto.getBaseUrl());
        return dto;
    }
}

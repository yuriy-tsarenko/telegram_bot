package com.telegrambot.mapper;

import com.telegrambot.bot.Bot;
import com.telegrambot.dto.BotDto;
import com.telegrambot.entity.BotEntity;
import org.springframework.stereotype.Component;

@Component
public final class BotMapper {

    private BotMapper() {
    }

    public BotDto mapEntityToDto(BotEntity entity) {
        BotDto dto = new BotDto();
        dto.setBotToken(dto.getBotToken());
        dto.setBotName(dto.getBotName());
        dto.setId(dto.getId());
        dto.setBaseUrl(dto.getBaseUrl());
        return dto;
    }
}

package com.telegrambot.mapper;

import com.telegrambot.dto.BotUserDto;
import com.telegrambot.entity.BotUserEntity;
import org.springframework.stereotype.Component;

@Component
public class BotUserMapper {

    private BotUserMapper() {
    }

    public BotUserEntity mapEntityToDto(BotUserDto dto) {
        BotUserEntity botUserEntity = new BotUserEntity();
        botUserEntity.setCanJoinGroups(dto.getCanJoinGroups());
        botUserEntity.setFirstName(dto.getFirstName());
        botUserEntity.setIsBot(dto.getIsBot());
        botUserEntity.setLanguageCode(dto.getLanguageCode());
        botUserEntity.setLastName(dto.getLastName());
        botUserEntity.setReadAllGroupMessages(dto.getReadAllGroupMessages());
        botUserEntity.setSupportInlineQueries(dto.getSupportInlineQueries());
        botUserEntity.setUserId(dto.getUserId());
        botUserEntity.setId(dto.getId());
        return botUserEntity;
    }
}

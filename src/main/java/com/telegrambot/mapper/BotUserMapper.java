package com.telegrambot.mapper;

import com.telegrambot.dto.BotUserDto;
import com.telegrambot.entity.BotEntity;
import com.telegrambot.entity.BotUserEntity;
import org.springframework.stereotype.Component;

@Component
public class BotUserMapper {

    private BotUserMapper() {
    }

    public BotUserDto mapEntityToDto(BotUserEntity entity) {
        BotUserDto dto = new BotUserDto();
        dto.setCanJoinGroups(entity.getCanJoinGroups());
        dto.setFirstName(entity.getFirstName());
        dto.setIsBot(entity.getIsBot());
        dto.setLanguageCode(entity.getLanguageCode());
        dto.setLastName(entity.getLastName());
        dto.setReadAllGroupMessages(entity.getReadAllGroupMessages());
        dto.setSupportInlineQueries(entity.getSupportInlineQueries());
        dto.setUserId(entity.getUserId());
        dto.setId(entity.getId());
        return dto;
    }
}

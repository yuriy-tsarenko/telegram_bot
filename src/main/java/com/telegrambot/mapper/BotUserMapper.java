package com.telegrambot.mapper;

import com.telegrambot.dto.BotChatDto;
import com.telegrambot.dto.BotUserDto;
import com.telegrambot.entity.BotChatEntity;
import com.telegrambot.entity.BotUserEntity;
import org.springframework.stereotype.Component;

@Component
public class BotUserMapper {

    private BotUserMapper() {
    }

    public BotUserDto mapEntityToDto(BotUserEntity entity) {
        BotUserDto dto = new BotUserDto();
        dto.setCanJoinGroups(dto.getCanJoinGroups());
        dto.setFirstName(dto.getFirstName());
        dto.setIsBot(dto.getIsBot());
        dto.setLanguageCode(dto.getLanguageCode());
        dto.setLastName(dto.getLastName());
        dto.setReadAllGroupMessages(dto.getReadAllGroupMessages());
        dto.setSupportInlineQueries(dto.getSupportInlineQueries());
        dto.setUserId(dto.getUserId());
        dto.setId(dto.getId());
        return dto;
    }
}

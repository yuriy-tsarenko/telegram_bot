package com.telegrambot.mapper;

import com.telegrambot.dto.BotChatDto;
import com.telegrambot.entity.BotChatEntity;
import org.springframework.stereotype.Component;

@Component
public class BotChatMapper {

    private  BotChatMapper() {
    }

    public BotChatDto mapEntityToDto(BotChatEntity entity) {
        BotChatDto dto = new BotChatDto();
        dto.setAllMembersAdministrators(dto.getAllMembersAdministrators());
        dto.setBio(entity.getBio());
        dto.setDescription(entity.getDescription());
        dto.setFirstName(entity.getFirstName());
        dto.setLastName(entity.getLastName());
        dto.setInviteLink(entity.getInviteLink());
        dto.setTitle(entity.getTitle());
        dto.setType(entity.getType());
        dto.setUserName(entity.getUserName());
        dto.setId(entity.getId());
        return dto;
    }
}

package com.telegrambot.mapper;

import com.telegrambot.dto.BotChatDto;
import com.telegrambot.entity.BotChatEntity;
import org.springframework.stereotype.Component;

@Component
public class BotChatMapper {

    private  BotChatMapper() {
    }

    public BotChatEntity mapEntityToDto(BotChatDto dto) {
        BotChatEntity botChatEntity = new BotChatEntity();
        botChatEntity.setAllMembersAdministrators(dto.getAllMembersAdministrators());
        botChatEntity.setBio(dto.getBio());
        botChatEntity.setDescription(dto.getDescription());
        botChatEntity.setFirstName(dto.getFirstName());
        botChatEntity.setLastName(dto.getLastName());
        botChatEntity.setInviteLink(dto.getInviteLink());
        botChatEntity.setTitle(dto.getTitle());
        botChatEntity.setType(dto.getType());
        botChatEntity.setUserName(dto.getUserName());
        botChatEntity.setId(dto.getId());
        return botChatEntity;
    }
}

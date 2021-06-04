package com.telegrambot.mapper;

import com.telegrambot.dto.CommunityDto;
import com.telegrambot.entity.CommunityEntity;
import org.springframework.stereotype.Component;

@Component
public class CommunityMapper {

    private CommunityMapper() {
    }

    public CommunityDto mapEntityToDto(CommunityEntity entity) {
        CommunityDto dto = new CommunityDto();
        dto.setBotChatId(entity.getBotChatId());
        dto.setBotUserId(entity.getBotUserId());
        dto.setId(dto.getId());
        return dto;
    }
}

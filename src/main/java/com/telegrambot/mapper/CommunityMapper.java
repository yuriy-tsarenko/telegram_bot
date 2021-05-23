package com.telegrambot.mapper;

import com.telegrambot.dto.CommunityDto;
import com.telegrambot.entity.CommunityEntity;

public class CommunityMapper {

    private CommunityMapper() {
    }

    public CommunityEntity mapEntityToDto(CommunityDto dto) {
        CommunityEntity communityEntity = new CommunityEntity();
        communityEntity.setBotChatId(dto.getBotChatId());
        communityEntity.setBotUserId(dto.getBotUserId());
        communityEntity.setId(dto.getId());
        return communityEntity;
    }
}

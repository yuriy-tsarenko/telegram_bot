package com.telegrambot.mapper;

import com.telegrambot.dto.CommunityDto;
import com.telegrambot.entity.CommunityEntity;
import org.springframework.stereotype.Component;

@Component
public class CommunityMapper {

    private CommunityMapper() {
    }

    public CommunityEntity mapEntityToDto(CommunityDto dto) {
        CommunityEntity communityEntity = new CommunityEntity();
        communityEntity.setId(dto.getId());
        return communityEntity;
    }
}

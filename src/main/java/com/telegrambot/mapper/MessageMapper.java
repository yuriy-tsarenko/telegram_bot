package com.telegrambot.mapper;

import com.telegrambot.dto.MessageDto;
import com.telegrambot.entity.MessageTemplateEntity;
import org.springframework.stereotype.Component;


@Component
public class MessageMapper {

    private MessageMapper() {
    }

    public MessageDto mapEntityToDto(MessageTemplateEntity entity) {
        MessageDto dto = new MessageDto();
        dto.setBotId(entity.getBotId());
        dto.setCreated(entity.getCreated());
        dto.setDescription(entity.getDescription());
        dto.setExpireDate(entity.getExpireDate());
        dto.setId(entity.getId());
        dto.setType(entity.getType());
        dto.setTemplate(entity.getTemplate());
        return  dto;
    }
}

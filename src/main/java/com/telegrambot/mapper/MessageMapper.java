package com.telegrambot.mapper;

import com.telegrambot.dto.MessageDto;
import com.telegrambot.entity.MessageEntity;

public class MessageMapper {

    private MessageMapper() {
    }

    public MessageEntity mapEntityToDto(MessageDto dto) {
        MessageEntity messageEntity = new MessageEntity();
        messageEntity.setBotId(dto.getBotId());
        messageEntity.setCreated(dto.getCreated());
        messageEntity.setDescription(dto.getDescription());
        messageEntity.setExpireDate(dto.getExpireDate());
        messageEntity.setId(dto.getId());
        messageEntity.setType(dto.getType());
        messageEntity.setTemplate(dto.getTemplate());
        return  messageEntity;
    }
}

package com.telegrambot.mapper;

import com.telegrambot.dto.MessageDto;
import com.telegrambot.entity.MessageTemplateEntity;
import org.springframework.stereotype.Component;


@Component
public class MessageMapper {

    private MessageMapper() {
    }

    public MessageTemplateEntity mapEntityToDto(MessageDto dto) {
        MessageTemplateEntity messageEntity = new MessageTemplateEntity();
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

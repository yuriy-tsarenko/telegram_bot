package com.telegrambot.mapper;

import com.telegrambot.dto.TaskDto;
import com.telegrambot.entity.TaskEntity;
import org.springframework.stereotype.Component;

@Component
public class TaskMapper {

    private TaskMapper() {
    }

    public static TaskDto mapEntityToDto(TaskEntity entity) {
        TaskDto dto = new TaskDto();
        dto.setCreated(entity.getCreated());
        dto.setDescription(entity.getDescription());
        dto.setExpireDate(entity.getExpireDate());
        dto.setFrequency(entity.getFrequency());
        dto.setPayload(entity.getPayload());
        dto.setType(entity.getType());
        dto.setId(entity.getId());
        return dto;
    }
}

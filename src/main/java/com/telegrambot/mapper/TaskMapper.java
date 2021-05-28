package com.telegrambot.mapper;

import com.telegrambot.dto.TaskDto;
import com.telegrambot.entity.TaskEntity;
import org.springframework.stereotype.Component;

@Component
public class TaskMapper {

    private TaskMapper() {
    }

    static public TaskEntity mapEntityToDto(TaskDto dto) {
        TaskEntity taskEntity = new TaskEntity();
        taskEntity.setBotUserId(dto.getBotUserId());
        taskEntity.setCreated(dto.getCreated());
        taskEntity.setDescription(dto.getDescription());
        taskEntity.setExpireDate(dto.getExpireDate());
        taskEntity.setFrequency(dto.getFrequency());
        taskEntity.setPayload(dto.getPayload());
        taskEntity.setType(dto.getType());
        taskEntity.setId(dto.getId());
        return taskEntity;
    }
}

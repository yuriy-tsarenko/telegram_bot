package com.telegrambot.service.implementation;

import com.telegrambot.dto.TaskDto;
import com.telegrambot.integration_scenario.Scenario;
import com.telegrambot.service.IntegrationService;
import com.telegrambot.task_type.TaskType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@RequiredArgsConstructor
public class IntegrationServiceImpl implements IntegrationService {

    private final Scenario scenario;

    public TaskDto getTaskByType(String type) {
        //TODO: change with db access
//        return TaskMapper.mapEntityToDto(repository.findByType(type));
        TaskDto taskDto = new TaskDto();
        taskDto.setType(TaskType.WEATHER_INTEGRATION.getCode());
        taskDto.setPayload("4e93111404d9b19df7da2ac71de87af7");
        return taskDto;
    }

    public String getData(String city, String taskType) throws IOException, InterruptedException {
        return scenario.run(getTaskByType(taskType), city);
    }

}

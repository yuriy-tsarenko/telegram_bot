package com.telegrambot.integration_scenario;

import com.telegrambot.dto.TaskDto;

import java.io.IOException;

public interface Scenario {

    public String run(TaskDto dto, String... queryParams) throws IOException, InterruptedException;
}

package com.telegrambot.service;

import java.io.IOException;

public interface IntegrationService {

    String getData(String city, String taskType) throws IOException, InterruptedException;
}

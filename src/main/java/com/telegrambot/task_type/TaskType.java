package com.telegrambot.task_type;

public enum TaskType {
    WEATHER_INTEGRATION("weather_integration");

    private final String code;

    TaskType(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}

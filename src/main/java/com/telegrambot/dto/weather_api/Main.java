package com.telegrambot.dto.weather_api;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Main {
    public double temp;
    public double feels_like;
    public double temp_min;
    public double temp_max;
    public int pressure;
    public int humidity;
}

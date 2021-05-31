package com.telegrambot.dto.weather_api;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Wind {
    public double speed;
    public int deg;
    public int gust;
}

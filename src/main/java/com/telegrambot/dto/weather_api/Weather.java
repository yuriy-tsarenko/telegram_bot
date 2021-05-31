package com.telegrambot.dto.weather_api;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Weather {
    public int id;
    public String main;
    public String description;
    public String icon;
}

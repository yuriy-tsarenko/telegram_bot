package com.telegrambot.dto.weather_api;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Sys {
    public int type;
    public int id;
    public String country;
    public int sunrise;
    public int sunset;
}

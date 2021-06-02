package com.telegrambot.dto.weather_api;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Main {

    public double temp;

    @SerializedName("feels_like")
    public double feelsLike;

    @SerializedName("temp_min")
    public double tempMin;

    @SerializedName("temp_max")
    public double tempMax;

    public int pressure;
    public int humidity;
}

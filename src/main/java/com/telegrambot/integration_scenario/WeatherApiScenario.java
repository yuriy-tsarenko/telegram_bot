package com.telegrambot.integration_scenario;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.telegrambot.dto.TaskDto;
import com.telegrambot.dto.weather_api.Main;
import com.telegrambot.dto.weather_api.Root;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Component
public class WeatherApiScenario implements Scenario {
    @Override
    public String run(TaskDto dto, String... queryParams) throws IOException, InterruptedException {
        String city = queryParams[0];
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.openweathermap.org/data/2.5/weather?q="
                        + city + "&appid=4e93111404d9b19df7da2ac71de87af7&units=metric"))
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        Gson gson = new GsonBuilder().serializeNulls().create();
        Root root = gson.fromJson(response.body(), Root.class);
        return getMessage(root);
    }


    public String getMessage(Root root) {
        Main main = root.getMain();
        StringBuilder builder = new StringBuilder();
        builder.append("Current weather");
        builder.append("\n");
        builder.append("temperature: " + main.getTemp());
        builder.append("\n");
        builder.append("feels_like: " + main.getFeels_like());
        builder.append("\n");
        builder.append("pressure: " + main.getPressure());
        return builder.toString();
    }
}

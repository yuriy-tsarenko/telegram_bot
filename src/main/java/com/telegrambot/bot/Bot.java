package com.telegrambot.bot;

import com.telegrambot.repository.BotRepository;
import com.telegrambot.service.IntegrationService;
import com.telegrambot.task_type.TaskType;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.IOException;

@RequiredArgsConstructor
@Component
public class Bot extends TelegramLongPollingBot {

    private final IntegrationService integrationService;

    @Override
    public void onUpdateReceived(Update update) {
        try {
            SendMessage uploadMessage = new SendMessage();
            Message message = update.getMessage();
            uploadMessage.setChatId(String.valueOf(message.getChatId()));

            if (message.getText().equals("/start")) {
                String greeting = "Привет " + message.getFrom().getFirstName() + "\n";
                String text = "узнай прогноз погоды, напиши мне название города на английском\n";
                uploadMessage.setText(greeting + text);
            } else {
                String data = integrationService.getData(message.getText(), TaskType.WEATHER_INTEGRATION.getCode());
                uploadMessage.setText(data);
            }
            String commands = "/list";
            execute(uploadMessage);
        } catch (TelegramApiException | IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getBotUsername() {
        return "automation25_bot";
    }

    @Override
    public String getBotToken() {
        return "1527075170:AAHvyerOIecQUezM9P4dwssTe2E4GwVttgQ";
    }
}

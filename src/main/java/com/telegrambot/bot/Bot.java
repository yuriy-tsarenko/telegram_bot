package com.telegrambot.bot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Bot extends TelegramLongPollingBot {

    private SendMessage uploadMessage = new SendMessage();

    @Override
    public void onUpdateReceived(Update update) {
        Message message = update.getMessage();
        uploadMessage.setChatId(message.getChatId());
        uploadMessage.setText(message.getText());
        try {
            execute(uploadMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getBotUsername() {
        return "automation25_bot";
    }

    @Override
    public String getBotToken() {
        return "change_it";
    }
}

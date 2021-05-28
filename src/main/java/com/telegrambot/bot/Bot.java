package com.telegrambot.bot;

import com.telegrambot.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@RequiredArgsConstructor
@Component
public class Bot extends TelegramLongPollingBot {

    private final BotService botService;
    private final BotUserService botUserService;
    private final FileService fileService;
    private final MessageService messageService;
    private final TaskService taskService;

    @Override
    public void onUpdateReceived(Update update) {
        SendMessage uploadMessage = new SendMessage();
        Message message = update.getMessage();
        uploadMessage.setChatId(String.valueOf(message.getChatId()));
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
        return "1527075170:AAHvyerOIecQUezM9P4dwssTe2E4GwVttgQ";
    }
}

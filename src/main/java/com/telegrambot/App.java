package com.telegrambot;

import com.telegrambot.bot.Bot;
import com.telegrambot.util.AppEnv;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class App {
    public static void main(String[] args) {
        AppEnv.init();
//        ApiContextInitializer.init();
//        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
//        try {
//            telegramBotsApi.registerBot(new Bot());
//        } catch (TelegramApiException e) {
//            e.printStackTrace();
//        }
    }
}

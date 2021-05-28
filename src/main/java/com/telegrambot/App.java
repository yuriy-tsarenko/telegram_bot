package com.telegrambot;

import com.telegrambot.bot.Bot;
import org.flywaydb.core.Flyway;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class App {
    public static void main(String[] args) {
//        TODO: move datasource url to properties file
        Flyway flyway = Flyway.configure().dataSource("jdbc:mysql://localhost:3306/bot_db"
                + "?useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "change_it").load();
        // Start the migration
        flyway.migrate();
        ApplicationContext context = new AnnotationConfigApplicationContext("com.telegrambot");
        Bot bean = context.getBean(Bot.class);
        try {
            TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
            telegramBotsApi.registerBot(bean);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}

package com.telegrambot.util;

import java.io.InputStream;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public final class AppEnv {
    private AppEnv() {
    }

    private static volatile ConcurrentHashMap<String, Object> properties;

    public static void init() {
        InputStream inputStream = AppEnv.class.getClassLoader().getResourceAsStream("app.properties");
        Scanner scanner = new Scanner(inputStream);
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
    }
}

package com.telegrambot.util;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AppEnv {
    public static void main(String[] args) {

    }

    private static Properties properties;

    private static void init() throws IOException {

        FileInputStream inputStream = new FileInputStream("bot.properties");
        properties.load(inputStream);
    }

    //TODO: move code to separate class
    public static void scriptDemo() {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");
        try {
            engine.eval("print('Hello, JAVASCRIPT');");
            Invocable inv = (Invocable) engine;
//            inv.invokeFunction("");
        } catch (ScriptException e) {
            e.printStackTrace();
        }
    }
}


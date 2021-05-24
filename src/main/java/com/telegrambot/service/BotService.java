package com.telegrambot.service;

import com.telegrambot.dto.BotDto;

public interface BotService {

    /**
     * Method call saves new bot
     *
     * @param botDto - {@link BotDto}
     */
    void saveBot(BotDto botDto);
}

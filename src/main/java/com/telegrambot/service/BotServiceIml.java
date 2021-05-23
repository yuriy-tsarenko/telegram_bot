package com.telegrambot.service;

import com.telegrambot.dto.BotDto;
import com.telegrambot.repository.BotRepository;

public class BotServiceIml implements BotService {

    private final BotRepository botRepository = new BotRepository();

    @Override
    public void saveBot(BotDto botDto) {
        botRepository.getAllByName(botDto.getBotName());
    }

}

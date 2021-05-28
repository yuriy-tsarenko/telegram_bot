package com.telegrambot.service;

import com.telegrambot.dto.BotDto;
import com.telegrambot.repository.BotRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BotServiceIml implements BotService {

    private final BotRepository botRepository;

    @Override
    public void saveBot(BotDto botDto) {

        botRepository.getAllByName(botDto.getBotName());
    }

}

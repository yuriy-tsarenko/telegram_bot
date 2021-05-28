package com.telegrambot.service;

import com.telegrambot.dto.BotDto;
import com.telegrambot.entity.BotEntity;
import com.telegrambot.repository.BotRepository;
import com.telegrambot.repository.Type;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BotServiceIml implements BotService {

    @Type(value = BotEntity.class)
    private final BotRepository botRepository;

    @Override
    public void saveBot(BotDto botDto) {

        botRepository.getAllByName(botDto.getBotName());
    }

}

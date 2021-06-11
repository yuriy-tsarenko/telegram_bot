package com.telegrambot.service.implementation;

import com.telegrambot.dto.BotDto;
import com.telegrambot.repository.BotRepository;
import com.telegrambot.repository.MessageRepository;
import com.telegrambot.service.BotService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BotServiceIml implements BotService {

    @Override
    public void saveBot(BotDto botDto) {
    }

}

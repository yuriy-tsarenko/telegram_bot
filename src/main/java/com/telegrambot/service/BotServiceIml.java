package com.telegrambot.service;

import com.telegrambot.dto.BotDto;
import com.telegrambot.repository.BotRepository;
import com.telegrambot.repository.MessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BotServiceIml implements BotService {

//    private final BotRepository botRepository;
//    private final MessageRepository messageRepository;

    @Override
    public void saveBot(BotDto botDto) {
    }

}

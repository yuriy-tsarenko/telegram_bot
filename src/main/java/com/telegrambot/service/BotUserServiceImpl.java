package com.telegrambot.service;

import com.telegrambot.repository.BotUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BotUserServiceImpl implements BotUserService{
    BotUserRepository botUserRepository;
}

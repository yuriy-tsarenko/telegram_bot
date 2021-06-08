package com.telegrambot.service;

import com.telegrambot.dto.BotUserDto;
import com.telegrambot.entity.BotUserEntity;
import org.telegram.telegrambots.meta.api.objects.Message;

import java.util.List;

public interface BotUserService {
    List<BotUserEntity> getAll();
    Boolean getChatId(Long chatId);
    BotUserEntity addUser(BotUserEntity botUserEntity);
    void save(Message message);

}

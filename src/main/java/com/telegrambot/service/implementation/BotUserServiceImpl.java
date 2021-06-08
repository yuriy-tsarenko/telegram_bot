package com.telegrambot.service.implementation;

import com.telegrambot.dto.BotUserDto;
import com.telegrambot.entity.BotUserEntity;
import com.telegrambot.repository.BotUserRepository;
import com.telegrambot.service.BotUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.objects.Message;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BotUserServiceImpl implements BotUserService {
    final  private BotUserRepository botUserRepository;

    @Override
    public List<BotUserEntity> getAll() {
        return botUserRepository.findAll();
    }

    @Override
    public Boolean getChatId(Long chatId) {
        System.out.println("->"+botUserRepository.findByUserId(chatId));
        return botUserRepository.findByUserId(chatId) == null;
    }

    @Override
    public BotUserEntity addUser(BotUserEntity botUserEntity) {
        BotUserEntity saveUser = botUserRepository.saveAndFlush(botUserEntity);
        return saveUser;
    }

    @Override
    public void save(Message message) {
       BotUserEntity  user = new BotUserEntity();
       user.setUserId(message.getChatId());
       user.setFirstName(message.getFrom().getFirstName());
       user.setLastName(message.getFrom().getLastName());
       addUser(user);
    }
}

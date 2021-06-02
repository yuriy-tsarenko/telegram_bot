package com.telegrambot.service.implementation;

import com.telegrambot.repository.FileRepository;
import com.telegrambot.service.BotService;
import com.telegrambot.service.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FileServiceImpl implements FileService {

//    private final FileRepository repository;

    private final BotService botService;
}

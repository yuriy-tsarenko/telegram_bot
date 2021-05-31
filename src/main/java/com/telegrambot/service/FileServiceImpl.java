package com.telegrambot.service;

import com.telegrambot.repository.FileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FileServiceImpl implements FileService {

//    private final FileRepository repository;

    private final BotService botService;
}

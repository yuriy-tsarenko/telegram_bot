package com.telegrambot.service;

import com.telegrambot.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {

    TaskRepository taskRepository;
}

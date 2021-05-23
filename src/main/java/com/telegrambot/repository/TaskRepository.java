package com.telegrambot.repository;

import com.telegrambot.entity.TaskEntity;

public class TaskRepository extends GenericRepository<TaskEntity>{
    {
        init(TaskEntity.class);
    }
}

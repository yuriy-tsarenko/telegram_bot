package com.telegrambot.repository;

import com.telegrambot.entity.TaskEntity;
import org.springframework.stereotype.Repository;

@Repository
public class TaskRepository extends GenericRepository<TaskEntity>{
    {
        init(TaskEntity.class);
    }
}

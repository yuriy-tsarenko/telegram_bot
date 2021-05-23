package com.telegrambot.repository;

import com.telegrambot.entity.FileEntity;

public class FileRepository extends GenericRepository<FileEntity> {
    {
        init(FileEntity.class);
    }
}

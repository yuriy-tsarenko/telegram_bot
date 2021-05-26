package com.telegrambot.repository;

import com.telegrambot.entity.FileEntity;
import org.springframework.stereotype.Repository;

@Repository
public class FileRepository extends GenericRepository<FileEntity> {
    {
        init(FileEntity.class);
    }
}

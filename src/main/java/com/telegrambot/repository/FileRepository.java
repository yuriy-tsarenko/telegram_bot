package com.telegrambot.repository;

import com.telegrambot.entity.File;

public class FileRepository extends GenericRepository<File> {
    {
        init(File.class);
    }
}

package com.telegrambot.mapper;

import com.telegrambot.dto.FileDto;
import com.telegrambot.entity.FileEntity;

public class FileMapper {

    private FileMapper() {
    }

    public FileEntity mapEntityToDto(FileDto dto) {
        FileEntity fileEntity = new FileEntity();
        fileEntity.setBotUserId(dto.getBotUserId());
        fileEntity.setFileContent(dto.getFileContent());
        fileEntity.setFileId(dto.getFileId());
        fileEntity.setFileName(dto.getFileName());
        fileEntity.setFileSize(dto.getFileSize());
        fileEntity.setFileUniqueId(dto.getFileUniqueId());
        fileEntity.setId(dto.getId());
        fileEntity.setTimeType(dto.getTimeType());
        fileEntity.setSize(dto.getSize());
        return fileEntity;
   }
}

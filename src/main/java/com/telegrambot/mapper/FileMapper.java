package com.telegrambot.mapper;

import com.telegrambot.dto.FileDto;
import com.telegrambot.entity.FileEntity;
import org.springframework.stereotype.Component;

@Component
public class FileMapper {

    private FileMapper() {
    }

    public FileDto mapEntityToDto(FileEntity entity) {
        FileDto dto = new FileDto();
        dto.setBotUserId(entity.getBotUserId());
        dto.setFileContent(entity.getFileContent());
        dto.setFileId(entity.getFileId());
        dto.setFileName(entity.getFileName());
        dto.setFileSize(entity.getFileSize());
        dto.setFileUniqueId(entity.getFileUniqueId());
        dto.setId(entity.getId());
        dto.setTimeType(entity.getTimeType());
        dto.setSize(entity.getSize());
        return dto;
   }
}

package com.telegrambot.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class FileDto {

    private Long id;

    private Long botUserId;

    private String fileId;

    private String fileUniqueId;

    private Long size;

    private String fileName;

    private Date timeType;

    private Date fileSize;

    private String fileContent;
}

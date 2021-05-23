package com.telegrambot.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class TaskDto {

    private Long id;

    private Long botUserId;

    private String description;

    private String type;

    private String payload;

    private String frequency;

    private Date created;

    private Date expireDate;
}

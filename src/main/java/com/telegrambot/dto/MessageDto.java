package com.telegrambot.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class MessageDto {

    private Long id;

    private Long botId;

    private String description;

    private String type;

    private Boolean template;

    private Date created;

    private Date expireDate;
}

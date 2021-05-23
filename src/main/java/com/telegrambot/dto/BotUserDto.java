package com.telegrambot.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BotUserDto {

    private Long id;

    private String userId;

    private String firstName;

    private Boolean isBot;

    private String lastName;

    private String userName;

    private String languageCode;

    private String canJoinGroups;

    private String readAllGroupMessages;

    private String supportInlineQueries;

}

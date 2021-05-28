package com.telegrambot.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class BotChatDto {

    private Long id;

    private String type;

    private String title;

    private String firstName;

    private String lastName;

    private String userName;

    private Boolean allMembersAdministrators;

    private String description;

    private String inviteLink;

    private String bio;
}

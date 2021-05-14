package com.telegrambot.DBEntity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "bot_chat")
public class BotChat {
    @Id
    Long id;

    @Column(name="type")
    String type;

    @Column(name="title")
    String title;
    @Column(name="first_name")
    String firstName;

    @Column(name="last_name")
    String lastName;

    @Column(name="user_name")
    String userName;

    @Column(name="all_members_are_administrators")
    Boolean allMembersAdministrators;

    @Column(name="description")
    String description;

    @Column(name="invite_link")
    String inviteLink;

    @Column(name="bio")
    String bio;
}

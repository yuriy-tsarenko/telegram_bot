package com.telegrambot.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "bot_chat")
public class BotChatEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "chat_id")
    private Long chatId;

    @Column(name = "type")
    private String type;

    @Column(name = "title")
    private String title;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "all_members_are_administrators")
    private Boolean allMembersAdministrators;

    @Column(name = "description")
    private String description;

    @Column(name = "invite_link")
    private String inviteLink;

    @Column(name = "bio")
    private String bio;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "bot_chat_id")
    private Set<CommunityEntity> communityEntities;
}

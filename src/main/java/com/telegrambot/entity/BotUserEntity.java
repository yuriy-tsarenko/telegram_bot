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

@Setter
@Getter
@Entity
@Table(name = "bot_user")
public class BotUserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "is_bot")
    private Boolean isBot;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "language_code")
    private String languageCode;

    @Column(name = "can_join_groups")
    private String canJoinGroups;

    @Column(name = "can_read_all_group_messages")
    private String readAllGroupMessages;

    @Column(name = "support_inline_queries")
    private String supportInlineQueries;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "bot_user_id")
    private Set<TaskEntity> taskEntities;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "bot_user_id")
    private Set<CommunityEntity> communityEntities;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "bot_user_id")
    private Set<FileEntity> fileEntities;

}

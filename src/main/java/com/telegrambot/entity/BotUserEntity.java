package com.telegrambot.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Set;

@Setter
@Getter
@Entity
@Table(name = "bot_user")
@DynamicUpdate
public class BotUserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private String userId;

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

    @OneToMany(mappedBy = "bot_user",cascade = CascadeType.ALL)
    Set<TaskEntity> taskEntities;

    @OneToMany(mappedBy = "bot_user",cascade = CascadeType.ALL)
    Set<CommunityEntity> communityEntities;

    @OneToMany(mappedBy = "bot_user",cascade = CascadeType.ALL)
    Set<FileEntity> fileEntities;

}

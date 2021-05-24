package com.telegrambot.entity;

import com.telegrambot.util.DAOEntity;
import com.telegrambot.util.Repository;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "bot_user")
@DynamicUpdate
public class BotUser extends Repository implements DAOEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "user_id")
    String userId;

    @Column(name = "first_name")
    String firstName;

    @Column(name = "is_bot")
    Boolean isBot;

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

}

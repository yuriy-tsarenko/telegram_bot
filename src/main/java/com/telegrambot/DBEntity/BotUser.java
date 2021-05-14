package com.telegrambot.DBEntity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@Entity
@Table(name = "bot_user")
public class BotUser {
    @Id
    Long id;

    @Column(name="user_id")
    String userId;

    @Column(name="first_name")
    String firstName;

    @Column(name="is_bot")
    Boolean isBot;

            @Column(name="last_name")
            String last_name;

            @Column(name="user_name")
            String user_name;

            @Column(name="language_code")
            String languageCode;

            @Column(name="can_join_groups")
            String canJoinGroups;

            @Column(name="can_read_all_group_messages")
            String readAllGroupMessages;

            @Column(name="support_inline_queries")
            String supportInlineQueries;
}

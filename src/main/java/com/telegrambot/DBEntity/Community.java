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
@Table(name="community")
public class Community {
    @Id
    Long id;

    @Column(name = "bot_user_id")
    Long botUserId;

    @Column(name = "bot_chat_id")
    Long botChatId;
}

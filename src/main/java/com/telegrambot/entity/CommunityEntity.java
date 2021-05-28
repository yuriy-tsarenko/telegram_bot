package com.telegrambot.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "community")
@DynamicUpdate
public class CommunityEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "bot_user_id")
    private Long botUserId;

    @Column(name = "bot_chat_id")
    private Long botChatId;

    @ManyToOne
    @JoinColumn(name = "bot_user_id")
    BotUserEntity botUserEntity;

    @ManyToOne
    @JoinColumn(name="bot_chat_id")
    BotChatEntity botChatEntity;
}

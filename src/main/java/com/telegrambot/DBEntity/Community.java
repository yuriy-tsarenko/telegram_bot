package com.telegrambot.DBEntity;

import com.telegrambot.util.DAOEntity;
import com.telegrambot.util.Repository;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "community")
public class Community extends Repository implements DAOEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "bot_user_id")
    private Long botUserId;

    @Column(name = "bot_chat_id")
    private Long botChatId;
}

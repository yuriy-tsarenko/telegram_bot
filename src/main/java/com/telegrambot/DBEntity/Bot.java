package com.telegrambot.DBEntity;

import com.telegrambot.util.DAOEntity;
import com.telegrambot.util.Repository;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "bot")
public class Bot extends Repository implements DAOEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "bot_name")
    private String botName;

    @Column(name = "bot_token")
    private String botToken;

    @Column(name = "base_url")
    private String baseUrl;


}

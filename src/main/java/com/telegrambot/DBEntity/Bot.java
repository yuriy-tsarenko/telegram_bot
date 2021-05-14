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
@Table(name = "bot")
public class Bot {
    @Id
    Long id;
    @Column(name = "bot_name")
    String botName;

    @Column(name = "bot_token")
    String botToken;

    @Column(name = "base_url")
    String baseUrl;
}

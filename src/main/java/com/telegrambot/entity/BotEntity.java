package com.telegrambot.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "bot")
@DynamicUpdate
public class BotEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "bot_name")
    private String botName;

    @Column(name = "bot_token")
    private String botToken;

    @Column(name = "base_url")
    private String baseUrl;

    @OneToMany
    @JoinColumn(name = "bot")
    private Set<MessageTemplateEntity> messageTemplateEntitySet;

}

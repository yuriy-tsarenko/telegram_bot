package com.telegrambot.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "message_template")
@DynamicUpdate
public class MessageTemplateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "bot_id")
    private Long botId;
    @Column(name = "description")
    private String description;

    @Column(name = "type")
    private String type;

    @Column(name = "template")
    private Boolean template;

    @Column(name = "created")
    private Date created;

    @Column(name = "expire_date")
    private Date expireDate;

    @ManyToOne
    @JoinColumn(name = "bot_id")
    BotEntity botEntity;
}

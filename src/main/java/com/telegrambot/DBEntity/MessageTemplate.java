package com.telegrambot.DBEntity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Getter
@Setter
@Entity
@Table(name="message_template")
public class MessageTemplate {
    @Id
    Long id;

    @Column(name="bot_id")
    Long botId;
    @Column(name="description")
    String description;

    @Column(name="type")
    String type;

    @Column(name="template")
    Boolean template;

    @Column(name="created")
    Date created;

    @Column(name="expire_date")
    Date expireDate;
}

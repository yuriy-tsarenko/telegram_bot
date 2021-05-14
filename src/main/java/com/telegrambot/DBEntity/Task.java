package com.telegrambot.DBEntity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Setter
@Getter
@Entity
@Table(name="task")
public class Task {
    @Id
    Long id;

    @Column(name="bot_user_id")
    Long botUserId;

    @Column(name="description")
    String description;

    @Column(name="type")
    String type;

    @Column(name="payload")
    String payload;

    @Column(name="frequency")
    String frequency;

    @Column(name="created")
    Date created;

    @Column(name="expire_date")
    Date expireDate;
}


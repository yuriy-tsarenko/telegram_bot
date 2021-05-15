package com.telegrambot.DBEntity;

import com.telegrambot.util.DAOEntity;
import com.telegrambot.util.Repository;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Setter
@Getter
@Entity
@Table(name = "task")
public class Task extends Repository implements DAOEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "bot_user_id")
    private Long botUserId;

    @Column(name = "description")
    private String description;

    @Column(name = "type")
    private String type;

    @Column(name = "payload")
    private String payload;

    @Column(name = "frequency")
    private String frequency;

    @Column(name = "created")
    private Date created;

    @Column(name = "expire_date")
    private Date expireDate;
}


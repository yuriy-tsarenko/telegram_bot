package com.telegrambot.DBEntity;

import com.telegrambot.util.DAOEntity;
import com.telegrambot.util.Repository;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "bot_chat")
@DynamicUpdate
public class BotChat extends Repository implements DAOEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "type")
    private String type;

    @Column(name = "title")
    private String title;
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "all_members_are_administrators")
    private Boolean allMembersAdministrators;

    @Column(name = "description")
    private String description;

    @Column(name = "invite_link")
    private String inviteLink;

    @Column(name = "bio")
    private String bio;
}

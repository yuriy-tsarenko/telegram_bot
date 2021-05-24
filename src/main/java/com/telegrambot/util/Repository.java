package com.telegrambot.util;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Query;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public abstract class Repository<T> implements DAOEntity<T> {
    private Long id;
    private String botName;
    private String botToken;
    private String baseUrl;
    private String type;
    private String title;
    private String firstName;
    private String lastName;
    private String userName;
    private Boolean allMembersAdministrators;
    private String description;
    private String inviteLink;
    private String bio;
    private String userId;
    private Boolean isBot;
    private String languageCode;
    private String canJoinGroups;
    private String readAllGroupMessages;
    private String supportInlineQueries;
    private Long botUserId;
    private Long botChatId;
    private String fileId;
    private String fileUniqueId;
    private Long size;
    private String fileName;
    private Date timeType;
    private Date fileSize;
    private String fileContent;
    private Long botId;
    private Boolean template;
    private Date created;
    private Date expireDate;
    private String payload;
    private String frequency;

    @Override
    public void save() {
        Connector.getSession().save(this);
        Connector.close();
    }

    @Override
    @SuppressWarnings("unchecked")
    public void remove(Long id) {
        Class clazz = this.getClass();
        T t = (T) Connector.getSession().find(clazz, id);
        Connector.getSession().delete(t);
        Connector.close();
    }

    @Override
    public void insert() {
        Connector.getSession().update(this);
        Connector.close();
    }

    @Override
    @SuppressWarnings("unchecked")
    public T getById(Long id) {
        Class clazz = this.getClass();
        T t = (T) Connector.getSession().find(clazz, id);
        Connector.close();
        return t;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List getAll() {
        String entityName = this.getClass().getSimpleName();
        Query query = Connector.getSession().createQuery("SELECT " + entityName + " FROM " + entityName + " " + entityName);
        List entity = query.getResultList();
        return entity;
    }
}
package com.telegrambot.repository;

import com.telegrambot.util.SessionUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;


public class GenericRepository<T> {
    private final SessionUtil sessionUtil = new SessionUtil();
    private Class<T> clazz;
    private String simpleName;

    void init(Class<T> clazz) {
        this.clazz = clazz;
        this.simpleName = this.clazz.getSimpleName();
    }

    public T getById(Long id) {
        Session session = sessionUtil.getSession();
        T entity = session.get(this.clazz, id);
        sessionUtil.close();
        return entity;
    }

    public List<T> getAllByName(String name) {
        Session session = sessionUtil.getSession();
        Query<T> query = session.createQuery("from " + simpleName + " where name= :name", this.clazz);
        query.setParameter("name", name);
        List<T> resultList = query.getResultList();
        sessionUtil.close();
        return resultList;
    }

    public List<T> getAll() {
        Session session = sessionUtil.getSession();
        Query<T> query = session.createQuery("from " + simpleName, this.clazz);
        List<T> resultList = query.getResultList();
        sessionUtil.close();
        return resultList;
    }

    public void deleteById(Long id) {
        T authorById = getById(id);
        Session session = sessionUtil.getSession();
        session.delete(authorById);
        sessionUtil.close();
    }
}

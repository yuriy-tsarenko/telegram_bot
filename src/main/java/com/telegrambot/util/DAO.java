package com.telegrambot.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import javax.persistence.Query;
import java.util.List;

public class DAO<T> {
   private final Class<T> clazz;
    Session session;
    public DAO(Class<T> clazz) {
        this.clazz = clazz;
    }
/*
Connector
 */
    private Session getSession() {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.tld")
                .buildSessionFactory();
        session = sessionFactory.openSession();
        session.beginTransaction();
        return session;
    }

    private void close() {
        session.getTransaction().commit();
        if (session != null) {
            session.close();
        }
    }

    public void save(Object obj) {
        getSession().save(obj);
        close();
    }

    public void insert(Object obj) {
        getSession().update(obj);
        close();
    }

    public T getById(Long id) {
        return getSession().find(clazz, id);
    }

    public void update(Object... objects) {
    }

    public void delete(Long id) {
        getSession().delete(getById(id));
        close();
    }

    public  List<T> getAll() {
        String entityName =clazz.getSimpleName();
        //System.out.println(entityName);
        Query query = getSession().createQuery("SELECT " +entityName+" FROM "+ entityName+ " " +entityName);
        List<T> entity = query.getResultList();
        close();
        return entity;
    }
}

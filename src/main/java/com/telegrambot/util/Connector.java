package com.telegrambot.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Connector {
    static Session session = null;

    static public Session getSession() {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.tld")
                .buildSessionFactory();
        session = sessionFactory.openSession();
        session.beginTransaction();
        return session;
    }

    static public void close() {
        session.getTransaction().commit();
        if (session != null) {
            session.close();
        }
    }
}

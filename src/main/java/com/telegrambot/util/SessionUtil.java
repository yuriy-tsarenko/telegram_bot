package com.telegrambot.util;

import com.telegrambot.entity.BotEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class SessionUtil {
    private Transaction transaction;
    private Session session;

    private void init() {
        Configuration configure = new Configuration();
        configure.configure("hibernate_library.cfg.xml");
        //TODO: add entities
        configure.addAnnotatedClass(BotEntity.class);

        ServiceRegistry registry = new StandardServiceRegistryBuilder()
                .applySettings(configure.getProperties())
                .build();

        SessionFactory factory = configure.buildSessionFactory(registry);
        session = factory.openSession();
        transaction = session.beginTransaction();
    }

    public Session getSession() {
        if (session == null && transaction == null) {
            init();
        } else if (session != null && !session.isOpen()) {
            init();
        }
        return session;
    }

    public void close() {
        if (transaction.isActive()) {
            transaction.commit();
        }
        session.close();
    }
}

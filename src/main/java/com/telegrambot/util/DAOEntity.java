package com.telegrambot.util;

import java.util.List;

public interface DAOEntity<T> {
    void save();

    void remove(Long id);

    void insert();

    T getById(Long id);

    List<T> getAll();
}

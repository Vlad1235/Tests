package com.jmock.dao;

/**
 * Интерфейс для доступа к Базе Данных
 */
public interface DBase {
    String find(int id);
    int save(int id, String name) throws java.sql.SQLException;
}

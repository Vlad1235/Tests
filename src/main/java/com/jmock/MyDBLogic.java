package com.jmock;

import com.jmock.dao.DBase;

/**
 * Класс, использующий релизицию интрефейса.
 * Метод, который необходимо протестировать
 */
public class MyDBLogic {
    // проверка метода, который будет запрашивать в базе данных инфу и затем ее менять. Проверка логики метода
    // в случае тестирования в db нужно подставлять что-то что реализует интерфейс DBase но не связан с БД.
    public int editItem(int id, String newName, DBase db) throws java.sql.SQLException {
        int result = -1;
        System.out.println("edit item" + id);
        String itemName = db.find(id); // поиск в БД
        if (itemName != null) {
            itemName = newName;
            db.save(id, itemName); // сохранено в БД
            result = 1;
            return result;

        }
        return result;
    }
}

package com.jmock;

import com.jmock.dao.DBase;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class MyDBLogicTest {
    Mockery mockDB = new Mockery();

    @Test
    public void testEditItem() throws Exception {
        int id = 3;
        String newName = "новое имя";
        DBase db = mockDB.mock(DBase.class); // заглушка. В качестве аргумента передаем интерфейс, реализацию которого мы моделируем.
        mockDB.checking(new Expectations(){{ // прописываем ожидания от заглушки:
            oneOf(db).find(id); // моделирование поиска в БД по id
            oneOf(db).save(id, newName);// моделирование сохранения в БД нами нового присвоенного имени
        }});
        MyDBLogic instance = new MyDBLogic();
        int expResult = 1;// отредактирован один элемент.
        int result = instance.editItem(id, newName, db);
        assertEquals(expResult,result);
    }
}

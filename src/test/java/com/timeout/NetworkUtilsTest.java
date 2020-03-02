package com.timeout;

import org.junit.Test;

/**
 * Задача. Проверить, чтобы сервер соединялся с БД не больше 1 секунды
 *
 * Пример, как может изменится поведение тест-метода после последовательного наращивания логики проекта.
 */
public class NetworkUtilsTest {

    @Test(timeout = 2000) // установим макс время выполнения тестируемого метода, при превышеннии которого тест не пройдет
    public void getConnectionShouldReturnFasterThanOneSecond(){
         NetworkUtils.getConnection();
    }
}

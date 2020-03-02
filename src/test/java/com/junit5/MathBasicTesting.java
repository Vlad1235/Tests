package com.junit5;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;

import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;


@DisplayName("Тестим методы из класса MathBasic") // изменение имени теста
@TestInstance(TestInstance.Lifecycle.PER_CLASS) // для работы аннотации @BeforeAll. Техническая аннотация.
 class MathBasicTesting {
     private MathBasic math;

     /*
     Используются для возвращения в консоль более детальной информации о проводимом тесте
      */
     private TestInfo testInfo;
     private TestReporter testReporter;

    @BeforeAll
    void initBeforeCreationOfClass(TestInfo testInfo, TestReporter testReporter) {
        this.testInfo = testInfo; // работает по принципу Рефлексии в Джава. Есть доступ к классу как таковому. Можно узнать какой тег у какого метода например
        this.testReporter = testReporter;
    }

    @BeforeEach // название аннотации изменилось
    void init() {
        math = new MathBasic();
    }


    @AfterEach // закрываем, что необходимо закрыть после выполнения
    void wrapUpTest() {
        System.out.println("Закрыт");
    }

    @Test
    @DisplayName("Test add method")
    @Tag("oldtests") // чтобы потом когда будут написаны тысячи тестов можно селективно выбрать те, которые помечены одинаковым тэгом
    void addShouldGainSum() {
        System.out.println("Запускаем " + testInfo.getDisplayName() + " Тестовый класс+ "+ testInfo.getTestClass());
        int result = math.add(5, 6);
        assertEquals(11, result,"получаем сумму");
    }

    @Test
    @Disabled // @Ignore в JUnit 4
    @Tag("Circle") // можно потом в IDE выбрать запуск лишь тех тестов, которые помечены общим тегом
    void computeCircleAreaTest() {
        double y = Math.PI * 10 * 10;
        assertEquals(y, math.computeCircleArea(10), "should return circle area");
    }
    /*
    Необхожимо чтобы метод выбросил исключение. Это варинат для JUnit 5
     */
    @Test
    @Tag("oldtests")
    void divideTest() {
        assertThrows(ArithmeticException.class, () -> math.divide(1, 0), "must throw exception");
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)  // только в ОС Windows будет проверять, в остальных будет оключен.
    @EnabledOnJre(JRE.JAVA_11) // только если JRE будет 11 версии будет проверка, в остальных будет отключен.
    @Tag("Math")
    void minusTest() {
        Boolean xMorethanY = false;
        assumeTrue(xMorethanY);
        /*
        точка отсечения
        предполагается, что значение будет равно true, иначе смысла выполнять код ниже нет.
        Если не проходит, то тест не покажет ошибки, а просто выключится
        Для понимания - предположим логика кода зависит от работы сервера, тогда мы прописываем, предположим, что
        сервер подключен, если ДА то тест активен, если нет, то тест выключается.
        Так как иначе тест упадет и это будет не ошибка в логике теста, а внешняя ошибка.
         */
        int result = math.minus(6, 5);
        assertEquals(1, result);
    }

    @Test
    @DisplayName("many multiply in one")
    void multiplyShouldHaveMultiply() {
        assertAll( // если один из тестов упадет, то упадут все
                () -> assertEquals(4, math.multiply(2, 2), "suppose to have 4"),
                () -> assertEquals(0, math.multiply(0, 0), "suppose to have 0"),
                () -> assertEquals(25, math.multiply(5, 5), "suppose to have 25"),
                () -> assertEquals(12, math.multiply(4, 3), "suppose to have 12"),
                () -> assertEquals(-42, math.multiply(-6, 7), "suppose to have -42")
        );
    }
                /*
                Создаем отдельный вложенный класс, в котором мы можем собрать проверяющие один метод все тест-методы для нашего удобства
                Хотябы один тест внутри провалится, полностью весь класс тоже провалится
                 */
                @Nested
                @DisplayName("Тестим метод add() из класса MathUtils")
                class AddTest {
                    @Test
                    @DisplayName("addPositive")
                    void testAddPositive() {
                        assertEquals(3, math.add(1, 2), "must have 3");
                    }

                    @Test
                    @DisplayName("addNegative")
                    void testAddNegative() {
                        assertEquals(-3, math.add(-1, -2), "must have -3");
                    }

                    @Test
                    @DisplayName("addZero")
                    void testAddZero() {
                        assertEquals(0, math.add(0, 0), "must have 0");
                    }
                }


        @RepeatedTest(3) // повторение метода 3 раза причем можно на каждой итерации получать результат
        void PowTest(RepetitionInfo repetitionInfo) {
            repetitionInfo.getTotalRepetitions(); // Например для тестирования доступа к БД. 1 раз не прошло 2 и 3 успешно.
            double expected = 27;
            double actual = math.powX(3, 3);
            assertEquals(expected, actual, "calculation of pow is wrong");
        }


}

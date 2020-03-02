package com.basics;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeTrue;

/**
 * Пример построения Unit-теста с использованием Assume и Assert вместе.
 */
public class ManyCassesTest {

    @Test
    public void ifAddHttpShouldTrue() {
        ManyCasses manyCasses = new ManyCasses();
        String url = "www.google.com";
        if (!url.startsWith("http")) {
            url = manyCasses.addHttp(url);
        }
        assumeTrue(url.startsWith("http://")); // если FALSE, то тест-метод не упадет,а просто выключится.
        assertEquals("http://www.google.com", url);
    }
}



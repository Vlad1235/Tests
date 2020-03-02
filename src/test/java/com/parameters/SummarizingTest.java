package com.parameters;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

// Мы тестируем наш метод с 3 разными парами параметров.
@RunWith(Parameterized.class) // чтобы аннотация  @Parameterized.Parameters работала
public class SummarizingTest {
    private Summarizing summarizing;
    private int x, y, expResult;

    public SummarizingTest(int x, int y, int expResult) {
        this.x = x;
        this.y = y;
        this.expResult = expResult;
    }

    /*
    Значения для тестирования. Контейнер, которых хранит набор параметров
     */
    @Parameterized.Parameters
    public static Collection numbers(){
        return Arrays.asList(new Object[][]{
                {1,2,3},
                {2,3,5},
                {3,5,8}
        });
    }

    @Before
    public void setUp() {
        System.out.println("Hello for testing");
        summarizing = new Summarizing();
    }

    @After
    public void tearDown() {
        System.out.println("Test completed");
    }


    @Test
    public void methodShouldAdd() {
        int result = summarizing.add(x,y);
        assertEquals(expResult, result);
    }


}
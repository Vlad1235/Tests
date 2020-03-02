package com.basics;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BubbleSortTest {
    private BubbleSort sort;


   @Before // helper
   public void beforeEach(){
        System.out.println("Начало тестирования");
        sort = new BubbleSort();
    }

    @After
    public void afterEach(){
        sort = null;
        System.out.println("Тестирование метода завершено");
    }

    @Test
   public void bubbleSortMethod() {
        int[] result =sort.bubbleSortMethod(new int[] {1, 5, 4, 2, 3, 1, 7, 8, 0, 5});
        int[] expect = new int[]{0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
        assertArrayEquals(expect,result);
    }

}
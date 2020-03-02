package com.TestSuites;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AddTest {
    private MathBasic math = new MathBasic();

    @Test
   public void addShouldHaveSum() {
        int result = math.add(5, 6);
        assertEquals(11, result);
    }

    @Test
   public void addShouldHaveSum2() {
        int result = math.add(0, 6);
        assertEquals(6, result);
    }

}

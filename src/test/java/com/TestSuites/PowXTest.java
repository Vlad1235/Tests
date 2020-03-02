package com.TestSuites;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PowXTest {
    private MathBasic math = new MathBasic();
    private final double EPS = 1e-9; // уровень точности

    @Test
    public void PowTest(){
        double expected = 27;
        double actual = math.powX(3, 3);
        assertEquals(expected, actual,EPS);
    }
}

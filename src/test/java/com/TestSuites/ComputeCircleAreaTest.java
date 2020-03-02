package com.TestSuites;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ComputeCircleAreaTest {
    private final double EPS = 1e-9; // уровень точности
    private MathBasic math = new MathBasic();

    @Test
   public void computeCircleAreaTest() {
        double y = Math.PI * 10 * 10;
        assertEquals(y, math.computeCircleArea(10),EPS);
    }
}

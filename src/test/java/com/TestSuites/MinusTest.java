package com.TestSuites;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class MinusTest {
    private MathBasic math = new MathBasic();

    @Test
    public void minusShouldHaveNumber() {
        int result = math.minus(5, 6);
        assertEquals(-1, result);
    }

    @Test
    public void minusShouldHaveNumber2() {
        int result = math.minus(0, 6);
        assertEquals(-6, result);
    }
}

package com.TestSuites;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplyTest {
    private MathBasic math = new MathBasic();

    @Test
    public void multiplyShouldHaveMultiply(){
            assertEquals(25,math.multiply(5,5));
    }

}

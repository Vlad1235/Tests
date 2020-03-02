package com.TestSuites;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class DivideTest {
    private MathBasic math = new MathBasic();

    @Test(expected = ArithmeticException.class)
    public void divideShouldHaveZero(){
        math.divide(5,0);
    }

    @Test
    public void divideShouldHaveNumber(){
       assertEquals(2,math.divide(10,5));

    }

}

package com.exceptions;

import org.junit.Test;

/**
 * проверка на ожидаемое падение с выбросом конкретного исключения
 */
public class MyMathTest {

    @Test(expected = ArithmeticException.class)
    public void ZeroDenominatorShouldThrowException(){
        MyMath.divide(1,0);
    }

}

package com.exceptions;

public class MyMath {
    public static double divide(int number1, int number2) {
        int result;
        if (number2 == 0) {
            throw new ArithmeticException("cannot divide by zero");
        }
        result = number1 / number2;
        return result;
    }


}

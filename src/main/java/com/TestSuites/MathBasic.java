package com.TestSuites;

/**
 * Проверка методов алгебры
 */
public class MathBasic {

    public static double PI = Math.PI;

    public int add(int x, int y) {
        return x + y;
    }

    public double computeCircleArea(double radius) {
        return PI * radius * radius;
    }

    public int divide(int x, int y) {
        return x / y;
    }

    public int minus(int x, int y) {
        return x - y;
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public double powX(int x, int y){
        return Math.pow(x,y);
    }
}

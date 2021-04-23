package com.pract.rit2;

public class A extends MathOp {

    public A(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int addition(int a, int b) {

        return a + b;
    }

    @Override
    public int subtraction(int a, int b) {
        return a - b;
    }

    @Override
    public int multiplication(int a, int b) {
        return a * b;
    }

    @Override
    public int division(int a, int b) {
        return a / b;
    }

}

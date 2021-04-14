package com.pract.neel.complex;

//can take Scanner class and get this all elements from user
public class Runner {
    public static void main(String[] args) {
        A a = new A();
        a.a = 5;
        a.b = 10;
        System.out.println(a.sub(a.a, a.b));
        System.out.println(a.add(a.a, a.b));

        Complex_A first = new Complex_A(10, 11); // first is (10+11i) Complex Number
        Complex_A second = new Complex_A(-3, 7); // Second is (-3+7i) Complex Number

        Complex_A addition = new Complex_A(0, 0); // to initalize add total object
        Complex_A subtraction = new Complex_A(0, 0); // to initalize subtraction total object
        addition = addition.Complex_addition(first, second);
        subtraction = subtraction.Complex_subtraction(first, second);

        System.out.println("after addition of first and second " + addition.Real + "+" + addition.imaginary + "i");

        System.out.println(
                "after subtraction of first and second " + subtraction.Real + "+" + subtraction.imaginary + "i");

    }
}
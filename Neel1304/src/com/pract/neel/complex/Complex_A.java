package com.pract.neel.complex;

class Complex_A extends A {

    int Real, imaginary;
    // complex number a+ib;

    // a component
    // b component
    public Complex_A(int Real, int imaginary) {
        this.Real = Real; // a component
        this.imaginary = imaginary; // b component
    }

    Complex_A Complex_addition(Complex_A g, Complex_A h) {
        int Real = add(g.Real, h.Real);
        int imaginary = add(g.imaginary, h.imaginary);
        Complex_A added = new Complex_A(Real, imaginary);
        return added;
    }

    Complex_A Complex_subtraction(Complex_A g, Complex_A h) {
        int Real = sub(g.Real, h.Real);
        int imaginary = sub(g.imaginary, h.imaginary);
        Complex_A subtracted = new Complex_A(Real, imaginary);
        return subtracted;
    }
}

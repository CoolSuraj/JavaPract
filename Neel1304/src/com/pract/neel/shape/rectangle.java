package com.pract.neel.shape;

class rectangle extends shape {

    double length;
    double breadth;

    @Override
    double area(double... values) {
        length = values[0];
        breadth = values[1];
        return length * breadth;
    }

    @Override
    double perimeter(double... values) {
        length = values[0];
        breadth = values[1];

        return 2 * (length + breadth);
    }
}

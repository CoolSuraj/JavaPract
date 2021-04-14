package com.pract.neel.shape;

class circle extends shape {
    double radius;

    @Override
    double area(double... values) {
        radius = values[0];
        return PI * radius * radius; // PI is defined in Shape
    }

    @Override
    double perimeter(double... values) {
        radius = values[0];
        return 2 * PI * radius;
    }
}

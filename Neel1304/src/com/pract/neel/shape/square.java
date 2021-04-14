package com.pract.neel.shape;

class square extends rectangle {
    @Override
    double area(double... values) {
        breadth = values[0];
        length = breadth; // can be ommited by placing length twice
        return super.area(length, breadth);
    }

    @Override
    double perimeter(double... values) {
        breadth = values[0];
        length = breadth;
        return super.perimeter(length, breadth);
    }
}

package com.pract.neel.shape;

public class Runner {

    public static void main(String[] args) {
        square s = new square();
        rectangle r = new rectangle();
        circle c = new circle();
        
        System.out.println(r.area(2, 3));
        System.out.println(s.area(2));
        System.out.println(c.area(2.649)); // square root of 7 and a double value

        System.out.println(r.perimeter(2, 3));
        System.out.println(s.perimeter(2));
        System.out.println(c.perimeter(2.649));


    }
}

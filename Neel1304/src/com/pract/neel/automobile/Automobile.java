package com.pract.neel.automobile;

class Automobile {
    int no_wheels, no_mirror, gear;
    
    void run() {
        String className = this.getClass().getSimpleName(); // works in non static method
        System.out.println(className + " is running");
    }

    void abreak() {
        // break function in Automobile class
        String className = this.getClass().getSimpleName(); // works in non static method
        System.out.println(className + "  breaked");
    }

    void changeDirection(String direction) {
        String className = this.getClass().getSimpleName(); // works in non static method
        System.out.println(className + "  changed direction to " + direction);
    }

    @Override
    public String toString() {
        return "Automobile [gear=" + gear + ", no_mirror=" + no_mirror + ", no_wheels=" + no_wheels + "]";
    }
}

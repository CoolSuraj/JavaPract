package com.pract.neel.automobile;

class cycle extends twowheeler {
    public cycle() {
        super();
        this.gear = 0; // consider the Cycle has no gear
    }
    

    int getGear() {
        return this.gear;
    }


    @Override
    public String toString() {
        return "cycle [gear=" + gear + ", no_mirror=" + no_mirror + ", no_wheels=" + no_wheels + "]";
    }
}

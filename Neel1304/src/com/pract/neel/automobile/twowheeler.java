package com.pract.neel.automobile;

class twowheeler extends Automobile {
    public twowheeler() {
        no_wheels = 2;
        no_mirror = 2;
    }

    @Override
    public String toString() {
        return "twowheeler [gear=" + gear + ", no_mirror=" + no_mirror + ", no_wheels=" + no_wheels + "]";
    }

}

package com.pract.neel.automobile;



class motorcycle extends twowheeler {
    motorcycle() {
        super();
        this.gear = 4; // There are 4 geares to motorcycle
    }

    @Override
    public String toString() {
        return "motorcycle [gear=" + gear + ", no_mirror=" + no_mirror + ", no_wheels=" + no_wheels + "]";
    }
    

}

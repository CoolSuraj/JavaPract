package com.pract.neel.automobile;

class Toto extends Automobile{
    
    public Toto(){
        no_wheels = 3 ; //as it have 3 wheels
        no_mirror = 2 ;
        gear = 4;
    }

    @Override
    public String toString() {
        return "Toto [gear=" + gear + ", no_mirror=" + no_mirror + ", no_wheels=" + no_wheels + "]";
    }

    


}

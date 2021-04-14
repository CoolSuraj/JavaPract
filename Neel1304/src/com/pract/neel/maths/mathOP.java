package com.pract.neel.maths;

class mathOP {
     // first_no , second no;
    int real,imaginary;

    public mathOP(int real) {
        this.real = real;
        this.imaginary =0 ;
    }
    public mathOP(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    
    mathOP add(mathOP... values){
        int sumReal = 0;
        int sumImaginary=0;
        for (mathOP athOP : values) {
            sumReal += athOP.real;
            sumImaginary += athOP.imaginary;
        }
        mathOP summed = new mathOP(sumReal, sumImaginary);
        return summed;
    }

    void display(mathOP p){
        if(p.imaginary==0){
            System.out.println(p.real);
        }
        else{
            System.out.println(p.real+"+"+p.imaginary+"i");
        }
    }

    mathOP subtract(mathOP... values){
        int subReal = 0;
        int subImaginary=0;
        for (mathOP athOP : values) {
            subReal += athOP.real;
            subImaginary += athOP.imaginary;
        }
        mathOP subbed = new mathOP(subReal, subImaginary);
        return subbed;
    }
    
}

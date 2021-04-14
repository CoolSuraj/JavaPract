package com.pract.neel.maths;

public class Runner {
    public static void main(String[] args) {
        mathOP n1 = new mathOP(3);
        mathOP n2 = new mathOP(130);
        mathOP n3 = new mathOP(-34);
        mathOP sumRealNumber = new mathOP(0,0);
        sumRealNumber.display(sumRealNumber.add(n1,n2));
        sumRealNumber.display(sumRealNumber.add(n1,n2,n3));

        mathOP i1 = new mathOP(4,8);
        mathOP i2 = new mathOP(1,30);
        mathOP i3 = new mathOP(-34,30);
        mathOP sumImgNumber = new mathOP(0,0);
        sumImgNumber.display(sumImgNumber.add(i1,i2));
        sumImgNumber.display(sumImgNumber.add(i1,i2,i3));




        
    }
}

package com.suraj.mains.durga.sir.lectures;

import java.util.Date;
import java.util.function.Supplier;

public class Session8 {
	public static void main(String[] args) {
		//supplier<R> is just returns R
		//it have method public R get(){}
		Supplier<Date> s = ()->new Date();
		System.out.println(s.get());
		
		
		//Let's create 6 digit random OTP generator using supplier
		Supplier<Integer> otp = ()->{
			
			double d = Math.random();
			 System.out.println(d);
			 d=  (d)*1000000;
			 if((int)(d/100000) == 0)
			 {
				d*=10;
			 }
			return (int)d;
		
		};
		
		for(int i=1;i<=10;i++)
		System.out.println(otp.get());
		
		//another method for generating OTP
		Supplier<Integer> a = ()->{
			String otpt="";
			for(int i=0;i<6;i++) {
				otpt+=(int)(Math.random() * 10);
			}
			return Integer.parseInt(otpt);
		};
		
		System.out.println();
		System.out.println(a.get());
		
		
	}
	
}
package com.suraj.mains.durga.sir.lectures;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;


public class lambda {
	
	static int squareIt(int a) {
		return a*a;
	}
	
	public static void main(String[] args) {
		//to get Square you did this !!
		System.out.println("Square of 4: "+squareIt(4));
		
		//Similar code can be written as 
		Function<Integer,Integer> f = i-> i*i;
		System.out.println(f.apply(4));
		
		//to get even check we can go by usual method or 
		Predicate<Integer> p = i->i%2==0;
		boolean test = p.test(4);
		System.out.println(test);
		
		/*what is lambda function in Java 
		 * 1.  Anonymous function
		 * 2. without return type 
		 * 3. without modifiers
		 * 
		 * like this just ex.
		 * ()-> System.out.println("hello");
		 * */
		
	}

}

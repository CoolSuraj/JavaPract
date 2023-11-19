package com.suraj.mains.durga.sir.lectures;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Session8_2 {
	public static void main(String[] args) {
		//For 2 Arguments we use 2Argument functional interface it is same as one arg FI but with 2 args
		//Eg== BiPredicate  is simmilear to predicate but with 2 args
		BiPredicate<Integer,Integer> test = (a,b)->(a+b)%2==0;
		System.out.println(test.test(4, 4));
		
		
		//BiFunction  as same as Function
		BiFunction<Integer, Integer, Integer> bf = (a,b)->{
			return a+b;
		};
		System.out.println(bf.apply(1,2));
		
		//BiConsumer
		BiConsumer<Integer, String>  bc = (a,b)-> {
			
			for(int i=0;i<a;i++) {
				b+="a";
			}
			System.out.println(b);
		};
		bc.accept(10, "p");
		
		//as supplier do'nt take any input so do not have any bi....
		
	}
}
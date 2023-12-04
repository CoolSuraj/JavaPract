package com.suraj.mains.durga.sir.lectures;

import java.util.function.Function;

public class Session7 {
	
	//predicate is used for boolean check
	public static void main(String[] args) {
		/*
		 * Function is something provided by functional interface 
		 * Function->performs operation -> o/p
		 * 4->Square Operation->16
		 * 
		 * inerface Function<T,R> //T is the param to function and R is return type
		 * {
		 * public R apply(T t);//this is the method of functional interface
		 * }
		 * */
		//Simple Example 1.
		Function<Integer,Integer > f =	i->i*i;
		Integer sq = f.apply(4);
		System.out.println(f.apply(55));
		System.out.println(sq);
		
		//Example 2
		Function<String,Integer> len = s->s.length() ;
		System.out.println(len.apply("hgkjhsb hdsbsvniuob--"));
		
		//Example 3
		Function<String , String> upper = s->s.toUpperCase();
		System.out.println(upper.apply("nwe iozgp")); //making it capital
		
		Function<String , String> up = s->{
			String j=s.concat("ppp-");
			return j;
		};
		System.out.println(up.apply("ggg"));
		
		
		//function chaining
		System.out.println(upper.andThen(up).apply("fffffff"));  //first upper runs then up runs
		//now we can do the same by below lines
		System.out.println(up.compose(upper).apply("fffffff")); //here also first upper runs then up runs  although written opposite
		
		//Now in this fashion you can use it any number of times
		System.out.println(upper.andThen(up).andThen(up).andThen(up).andThen(up).apply("fffffff"));
		
		
		
		
		
		
	}

}

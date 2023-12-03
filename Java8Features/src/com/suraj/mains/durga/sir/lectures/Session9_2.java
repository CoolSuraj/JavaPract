package com.suraj.mains.durga.sir.lectures;

import java.util.function.BinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class Session9_2 {
	public static void main(String[] args) {
		
		//Unary Operator is Child of Function it will have both input and o/p type same
		UnaryOperator<Integer> u = 	i->i*2;
		System.out.println(u.apply(6));
		
		//Also we can use
		IntUnaryOperator v = i->i*2;
		System.out.println(v.applyAsInt(6));
		
		//Similarly we have DoubleUnaryOperator, LongUnaryOperator
		
		
		//BinaryOperator is child of BiFunction but with both input and o/p type same
		
		BinaryOperator<Integer> w = (a,b)-> a*b;
		Integer apply = w.apply(3, 3);
		System.out.println(apply);
		
	}

}
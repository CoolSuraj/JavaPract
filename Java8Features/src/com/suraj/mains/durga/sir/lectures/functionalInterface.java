package com.suraj.mains.durga.sir.lectures;
import com.suraj.functionalinterfaces.BasicFunctionalInterface;
import com.suraj.functionalinterfaces.FunctionalInterfacesWithOneParam;
import com.suraj.functionalinterfaces.FunctionalInterfacesWithTwoParams;

public class functionalInterface {
	public static void main(String[] args) {
		/* Functional Interface is the one which contains single  method
		 * (it should be abstract)
		 * @FunctionalInterface is annotation for declaring interface as functional Interface
		 * now using functional interface and lambda we will try to print hello and do small calculations
		 * */
		
		BasicFunctionalInterface bfi = ()-> System.out.println("Hello World!!");  //this is more like implementation of abstract method saves some line of codes
		bfi.key();
		
		FunctionalInterfacesWithTwoParams g = (a,b)-> System.out.println(a+b);
		g.calc(3, 5);
		
		FunctionalInterfacesWithTwoParams h = (a,b)-> {
			a=a+b;
			b=a+b;
			System.out.println(a+b);
		};
		h.calc(1, 1);
		
		FunctionalInterfacesWithOneParam f = a -> a*a;
		System.out.println(f.calc(3));
	}

}

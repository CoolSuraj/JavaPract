package com.suraj.functionalinterfaces;

@FunctionalInterface  // annotation is not mandatory it is there so it is
public interface BasicFunctionalInterface {

	public void key();  //this should be unique--> only one abstract method
	
	//but we can have multiple static methods and Default methods
	default void m1() {
		
	}
	public static void m2() {
		
	}
}

@FunctionalInterface
interface B extends BasicFunctionalInterface{
	//as long as we do not create abstract method here this is also functional interface
}

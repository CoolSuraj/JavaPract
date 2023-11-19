package com.suraj.mains.durga.sir.lectures;

import java.util.function.Consumer;
import java.util.function.Function;

public class Session7_2 {
	
	//Consumer
	public static void main(String[] args) {
		
		//void Consumer<T>  takes T as parameter and returns nothing.
		//method is public void accept(T t);
		
		Consumer<String> p = s->System.out.println(s);
		p.accept("Durga");
		
		Consumer <Integer> c = i->System.out.println(i*i);
		c.accept(3);
		
		
		
		
		
		
	}

}

/**
 * 
 */
package com.suraj.mains.durga.interfaces;

/**
 * 
 */
public interface DefaultAndStatic {
	
	default void m1() {
		System.out.println("default m1");
	}
	default void m2() {
		System.out.println("default m2");
	}
	static void m4() {
		System.out.println("static m3");
	}

}

package com.suraj.mains.durga.sir.lectures;

import java.util.function.Predicate;

public class Session6 {
	public static void main(String[] args) {
		Predicate<String> p = s->s.length() <4;
		boolean less4 = p.test("Hello");
		System.out.println(less4);
	}

}

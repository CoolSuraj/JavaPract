package com.suraj.mains.durga.sir.lectures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Session3_2 {
//Lambda Expressions multithreading 

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(103);
		al.add(03);
		al.add(140);
		al.add(13);
		al.add(93);
		al.add(101);
		al.add(193);
		al.add(8);

		System.out.println(al);

		// to sort we can use Collections.sort();
		// Collections.sort(al, Comparator c); //we need to give comparator object to
		// sort method to decide how to sort

		/*
		 * comaprator.compare method(obj1,obj2) 
		 * returns -ve iff obj1 has to come befores obj2 
		 * returns +ve iff obj1 has to come after obj2 
		 * returns 0 iff obj1 and obj2 are equal
		 */
		// myComparator mc = new myComparator();//this is before 1.8
//		Collections.sort(al, (a, b) -> {
//			if (a > b) {
//				return 1;
//			} else if (a < b) {
//				return -1;
//			}
//			return 0;
//		});
		//we can use ternary operator along with this to make it more shorted
		// Comparator<Integer> c= (a,b)-> (a>b)?1:(a<b)?-1:0; //this c can be given to next line
		Collections.sort(al,(a,b)-> (a>b)?1:(a<b)?-1:0 );
		System.out.println(al);
	}

}
//This is something we used to do //but this creates another class so 
//class myComparator implements Comparator<Integer>{
//
//	
//	public int compare(Integer o1, Integer o2) {
//		//ascendening order
////		if(o1 > o2 ) {
////			return 1;
////		}else if(o1<o2) {
////			return -1;
////		}
//		//for descending order
//		if(o1 > o2) {
//			return -1;
//		}else if(o1<o2) {
//			return 1;
//		}
//		
//		return 0;
//	}
//	
//}

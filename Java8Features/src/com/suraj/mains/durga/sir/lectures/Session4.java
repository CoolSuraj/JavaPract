package com.suraj.mains.durga.sir.lectures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import com.suraj.mains.durga.sir.dto.Employee;

public class Session4 {

	public static void main(String[] args) {
		List<Employee> el = new ArrayList<>();
		el.add(new Employee("vishal",5));
		el.add(new Employee("komal",6));
		el.add(new Employee("abhash",58));
		
		//to sort we can use 
		//Collections.sort(el,(a,b)->(a.getEno() > b.getEno())?1:(a.getEno() < b.getEno())?-1:0);
		Collections.sort(el,(a,b)->a.getName().compareTo(b.getName()));//sorted by name //this is done using Lambda Expressions
		//we can do same with anonymous inner class of Java
		//this is more powerful as this can work on any interface where lambda only work on funcional interfaces
//		Collections.sort(el, new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee a, Employee b) {
//				
//				return a.getName().compareTo(b.getName());
//			}
//			
//		});
		
		
		System.out.println(el);
		
	}

}

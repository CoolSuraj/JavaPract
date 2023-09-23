package com.suraj.mains.durga.sir.dto;

public class Employee {
	public String name;
	public long eno;
	public Employee(String name, long eno) {
		super();
		this.name = name;
		this.eno = eno;
	}
	public Employee() {
		
	}
	
	@Override
	public String toString() {
		return eno+":"+name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getEno() {
		return eno;
	}
	public void setEno(long eno) {
		this.eno = eno;
	}
	
	

}

package com.tnsif.staticdemo;

public class Employee {
	//declare variables
	private String name;
	private int id;
	static String comapanyName="TNS";
	
	
	
	
	//Parameterized constructor
	public Employee(String name, int id) {
		
		this.name = name;
		this.id = id;
	}




	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ",Company="+comapanyName+"]";
	}
	
	
	
	

}

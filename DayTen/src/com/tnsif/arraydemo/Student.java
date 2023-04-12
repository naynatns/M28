//Student entity
package com.tnsif.arraydemo;

public class Student {
	private int rollNo;
	private String name;
	private String year;
	
	//constructor
	public Student(int rollNo, String name, String year) {
		this.rollNo = rollNo;
		this.name = name;
		this.year = year;
	}

	
	//Getter and Setter
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
	
	

	
}

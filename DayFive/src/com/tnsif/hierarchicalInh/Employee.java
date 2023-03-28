package com.tnsif.hierarchicalInh;

public class Employee extends Person{
	
	
	private int empId;
	private float salary;
	private String dept;
	
	//default constructor
	public Employee() {
		System.out.println("default Constructor");;
	}

	
	
	public Employee(int empId, float salary, String dept) {
		super();
		this.empId = empId;
		this.salary = salary;
		this.dept = dept;
	}


	//constructor
	public Employee(String name, String city,int empId, float salary, String dept) {
		super(name,city);
		this.empId = empId;
		this.salary = salary;
		this.dept = dept;
	}
	
	
	

	//getter and setter
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", salary=" + salary + ", dept=" + dept + ", getName()=" + getName()
				+ ", getCity()=" + getCity() + "]";
	}
	
	
	
	

}

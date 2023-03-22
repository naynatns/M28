package com.tnsif.daythree.encapsulation;

public class OopsConceptDemo {
	
	//member variables
	private int serialNum;
	private String name;
	private int age;
	
	//methods
	public int getSerialNum() {
		return serialNum;
	}
	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	//Object Class -method-to return string representation of the object
	
	@Override
	public String toString() {
		return "OopsConceptDemo [serialNum=" + serialNum + ", name=" + name + ", age=" + age + "]";
	}
	
	
	public static void main(String[] args) {

		OopsConceptDemo obj=new OopsConceptDemo();
		obj.setName("Nayna");
		obj.setAge(22);
		obj.setSerialNum(1);
		System.out.println(obj);
		
		

		
		
	}
	

}

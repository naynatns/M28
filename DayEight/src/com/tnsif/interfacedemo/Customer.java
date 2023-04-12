package com.tnsif.interfacedemo;

public class Customer {

	// member variables
	private String name;
	private String city;
	private int age;

	// Parameterized constructor
	public Customer(String name, String city, int age) {

		this.name = name;
		this.city = city;
		this.age = age;
	}

	// default con
	public Customer() {
		super();
	}

	// getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

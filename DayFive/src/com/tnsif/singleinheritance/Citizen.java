package com.tnsif.singleinheritance;

public class Citizen {

	private String name;
	private String aadharNo;
	private String address;
	private long phNo;

	// Default Constructor
	public Citizen() {
		System.out.println("Default Con");
	}

	// Parameterized constructor
	public Citizen(String name, String aadharNo, String address, long phNo) {
		this.name = name;
		this.aadharNo = aadharNo;
		this.address = address;
		this.phNo = phNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhNo() {
		return phNo;
	}

	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}

	@Override
	public String toString() {
		return "Citizen [name=" + name + ", aadharNo=" + aadharNo + ", address=" + address + ", phNo=" + phNo + "]";
	}

}

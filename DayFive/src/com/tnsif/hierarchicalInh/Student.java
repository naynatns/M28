package com.tnsif.hierarchicalInh;

public class Student extends Person {

	private String className;
	private float per;

	public Student() {
		System.out.println("Student class constructor");
		className="BE";
		per=87.9f;
	}

	// constructor
	public Student(String className, float per) {
		super();
		this.className = className;
		this.per = per;
	}

	// getter and setter
	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public float getPer() {
		return per;
	}

	public void setPer(float per) {
		this.per = per;
	}

	@Override
	public String toString() {
		return "Student [className=" + className + ", per=" + per + ", getName()=" + getName() + ", getCity()="
				+ getCity() + "]";
	}

}

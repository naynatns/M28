package com.tnsif.staticdemo;

public class MyClass {
	
	private int section;
	private static int srNo;
	
	static {
		System.out.println("In static block");
		srNo++;
		}
	
	MyClass()
	{
		System.out.println("In constructor");
		srNo++;
		section++;
	}
	
	static void display()
	{
		System.out.println(srNo);
		//System.out.println(section);
	}
	
	public void show()
	{
		System.out.println(srNo);
		//System.out.println(section);
	}


	@Override
	public String toString() {
		return "MyClass [section=" + section + " srNo=" + srNo + "]";
	}
	
	

}

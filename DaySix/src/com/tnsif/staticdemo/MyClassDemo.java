package com.tnsif.staticdemo;

public class MyClassDemo {

	public static void main(String[] args) {
		
		
		MyClass.display();
		
		
		
		MyClass m=new MyClass();
		System.out.println(m);// section=1 srNo=2
		
		MyClass m1=new MyClass(); // section=1 srNo=3
		System.out.println(m1);
		MyClass.display();
		

		MyClass m2=new MyClass(); // section=1 srNo=4
		System.out.println(m2);

	}

}

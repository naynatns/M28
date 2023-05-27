package com.tnsif.builtinannotations;


import java.util.ArrayList;
import java.util.List;


public class AnnotationsDemo {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		
		List al=new ArrayList(); //loose Coupling
		
		Student s1=new Student(100,"Sudip",88.99f);
		
		al.add(10);
		al.add(45.88f);
		al.add('c');
		al.add("Nayna");
		al.add(s1);
		al.add(new Student(101,"Sikindra",99.9f));
		
		System.out.println(al);
		
				

	}

}

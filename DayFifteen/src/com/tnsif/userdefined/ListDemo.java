//Program to demonstrate List collection for user defined objects
package com.tnsif.userdefined;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// Adding User Defined objects into ArrayList
		List<Student> studentList = new ArrayList<Student>();
		
		Student s1 = new Student(11, "Pooja", 78);
		studentList.add(s1);
		s1 = new Student(21, "Nikita", 85);
		studentList.add(s1);
		s1 = new Student(13, "Deepa", 68);
		studentList.add(s1);
		s1 = new Student(41, "Neha", 72);
		studentList.add(s1);
		
		studentList.add(new Student(15,"Hemanth",99));
		
		System.out.println("Students Details are as follows\n"+studentList);
		
		//Collections.sort(studentList); //CTE 
		
	}

}

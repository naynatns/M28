//Program to demonstrate generic method
package com.tnsif.dayfifteen.generics;

public class GenericMethodTest {
	//Generic Method
	public <E> void displayArrayElements(E[] elements) {
		for (E ele : elements) {
			System.out.println("element is: " + ele);
		}
	}
	

	public static void main(String[] args) {
		GenericMethodTest obj = new GenericMethodTest();
		Integer[] intarray = { 10, 20, 30, 40 };
		String[] str = { "java", "programming", "learning" };

		
		  obj.displayArrayElements(intarray); 
		  obj.displayArrayElements(str);
		 
		
	
	}

}
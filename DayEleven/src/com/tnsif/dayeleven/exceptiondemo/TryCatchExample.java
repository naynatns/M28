package com.tnsif.dayeleven.exceptiondemo;

public class TryCatchExample {
	static void divide(int x, int y) {
		System.out.println("I am in method");

		int z;
		try {
			z = x / y;
			System.out.println("I am in try block");
			System.out.println(z);
		} catch (ArithmeticException e) {
			System.out.println("I am in catch block");

			System.out.println("Arithmetic exception due to "+e.getMessage());
			}
		
	}

}

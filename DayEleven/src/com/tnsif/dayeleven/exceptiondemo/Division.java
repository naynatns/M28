package com.tnsif.dayeleven.exceptiondemo;

import java.util.Scanner;

public class Division {

	public static void divide() {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int arr[] = { 10, 20 };

		try {
			a = sc.nextInt();
			b = sc.nextInt();
			c = a / b;
			System.out.println(c);
			System.out.println(arr[c]);

		} catch (ArithmeticException ae) {
			System.err.println("Error Occurred" + ae.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Array Error Occurred" + e.getMessage());
		} catch (Exception a1) {
			System.out.println("Error Occured once again " + a1.getMessage());
		}

	}

}

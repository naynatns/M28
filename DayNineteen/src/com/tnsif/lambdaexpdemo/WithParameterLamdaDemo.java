package com.tnsif.lambdaexpdemo;

import java.util.Scanner;

public class WithParameterLamdaDemo {

	public static void main(String[] args) {

		Cube c = (a) -> {
			return (a * a * a);
		};

		System.out.println(c.calculate(4));

		Cube c1 = (a) -> a * a * a;

		System.out.println(c.calculate(5));

		Cube c2 = (a) -> {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter input");
			a=sc.nextInt();
			return a*a*a;
			}
;

		System.out.println(c2.calculate(5));
		
		IsOdd odd=(a)->(a % 2 != 0)? true:false;
		
		System.out.println("Is number 11 is odd? "+odd.checkOdd(11));
		System.out.println("Is number 16 is odd? "+odd.checkOdd(16));
	}

}

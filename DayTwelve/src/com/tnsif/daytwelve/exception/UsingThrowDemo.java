package com.tnsif.daytwelve.exception;

import java.util.Scanner;

public class UsingThrowDemo{
	
	static int acceptNumber() {
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		sc.close();
		return num;
		
	}

	public static void main(String[] args) {
		
	int per;
	System.out.println("Enter your percentage:  ");
		
		per=acceptNumber();
		
		try
		{
			if(per<0)
			{
				throw new ArithmeticException("Percentage should not be negative");
			}
			else if (per>100)
				throw new ArithmeticException("Percentage should not be greater than 100");
			else
				System.out.println("Valid Percentage"+per);
		}catch(ArithmeticException e)
		{
			System.err.println("Error"+e.getMessage());
		}
		
	}

}

package com.tnsif.daytwelve.exception;

import java.util.Scanner;

public class AgeTestDemo {
	
	static boolean validate(int age)
	{
		if(age<18)
		return false;
		else
			return true;
	}
		

	public static void main(String[] args) {
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		age=sc.nextInt();
		
		try
		{
			if(validate(age))
				System.out.println("Welcome to Vote");
		
		else
			throw new InvalidAgeException();
				
		}catch(InvalidAgeException e)
		{
			System.out.println("caught an exception "+e.getMessage());
		}
		finally
		{
			sc.close();
			System.out.println("Finally block");
		}
	}

}

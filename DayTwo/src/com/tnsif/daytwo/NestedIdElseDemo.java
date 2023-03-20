package com.tnsif.daytwo;

public class NestedIdElseDemo {

	public static void main(String[] args) {

		int a=10; 
		int b=80;
		int c=3;
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("a is greater");
			}
			else
			{
				System.out.println("c is greater");

			}
		}else
		{
			if (c>b)
			{
				System.out.println("c is greater");
			}
			else
			{
				System.out.println("b is greater");

			}
			
		}
			
		
		
	}

}

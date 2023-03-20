package com.tnsif.daytwo;

public class OperatorDemo {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		int x=10;
		
		System.out.println("a="+a+" "+"b= "+b+" "+"x="+x) ;
		
		
		/*
		 * System.out.println(a++); //10 System.out.println(++a);; //12
		 */		
		
		++a; //11
		int c=++a+b+a--;
		System.out.println("valuue of c is "+c); //44
		
		int d=c++ +a +b--;
		System.out.println("d= "+d);  //75
		
		System.out.println("b="+b);
		
		//ternary operator 
		
		x=(10==x)? 1:0;
		System.out.println("x="+x);
		
		
		
		
		
	}

}

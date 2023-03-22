package com.tnsif.daythree.encapsulation;

import java.util.Scanner;

public class ConstructorDemo {

	public static void main(String[] args) {

		
		
		Customer c=new Customer("Gajanan",100,"Banglore");
		System.out.println(c);
		
		

		Customer c1=new Customer();
		System.out.println(c1);
		
		
		Scanner sc=new Scanner(System.in);
		
		String name,city;
		int id;
		
		
		System.out.println("Enter customer id");
		id=sc.nextInt();
		
		System.out.println("Enter customer Name");
		name=sc.next();
		
		System.out.println("Enter customer City");
		city=sc.next();
		
		Customer c2=new Customer(name,id,city);
		System.out.println(c2);


		
		
	}

}

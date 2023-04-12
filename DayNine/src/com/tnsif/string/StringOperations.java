package com.tnsif.string;

public class StringOperations {

	public static void main(String[] args) {
		String s1=new String(" Indian ");
		String s2=s1.toUpperCase();
		System.out.println(s1);
		System.out.println(s2);
		
		int a=s1.length();
		System.out.println(a);
		
		String s3=s1.substring(2);
		System.out.println(s3);
		
		System.out.println(s1.substring(2, 4));
		
		System.out.println(s1.charAt(3));
		
		System.out.println(s1);
		System.out.println(s1.trim());
		
		System.out.println(s1.isEmpty());
		
		
		//string comparison
		
		s1="Good Morning";
		s2=new String(s1);
		
		System.out.println("output of equals method  "+s1.equals(s2)); //true
		

		System.out.println("output of ==  "+s1==(s2)); //false

		
		
		
		
	}

}

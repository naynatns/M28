package com.tnsif.string;

public class StringComparison {

	public static void main(String[] args) {

		
		//creating the Strings using literals
		
		String s1="TNSIF";
		String s2="TNSIF";
		
		//creating the strings using new operator
		
		String s3=new String("TNSIF");
		String s4=new String("TNSIF");
		
		//== and equals
		System.out.println("case1-->"+s1.equals(s2)); //true
		
		System.out.println("case2-->"+s1.equals(s3)); //false
		
		System.out.println("case 3-->"+s1==s2); //true
		
		System.out.println("case 4-->"+s1==s4); //false
		
		System.out.println("case 5-->"+s3==s4); //false
		
		//compare To method
		
		
		System.out.println(s1.hashCode());
		System.out.println(s1.compareTo("tnsif")); //
		
		System.out.println(s1.compareToIgnoreCase("tnsif"));

		System.out.println(s1.compareTo(s2));
	}

}

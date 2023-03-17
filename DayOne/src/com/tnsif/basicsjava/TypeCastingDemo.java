package com.tnsif.basicsjava;

public class TypeCastingDemo {

	public static void main(String[] args) {

		
		//widening type casting or implicit type casting
		
		byte one=10;
		int i=one;
		System.out.println(i);
		
		float two=23.6f;
		System.out.println(two);

		double d=two;
		System.out.println(d);
		
		char ch='A';
		System.out.println(ch);
		
		int in=ch;
		System.out.println(in);
		
		//narrowing /explicit type casting
		
		double s=107.4d;
		System.out.println(s);

		float fOne=(float)s;
		System.out.println(fOne);
		
		long l=24343546546557657L;
		int num=(int)l;
		System.out.println(num);
		
		
	}

}

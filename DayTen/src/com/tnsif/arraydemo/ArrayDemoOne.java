package com.tnsif.arraydemo;

class ArrayOperations {
	// print int Array
	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i] + "\t");
		System.out.println();
	}

	// variable argument function

	public static int getSum(int... n) {
		int sum = 0;
		for (int no : n)
			sum += no;
		return sum;

	}

	// count no. of odd elements
	public static int getOddCount(int b[]) {
		int count = 0;
		for (int i = 0; i < b.length; i++) {
			if (b[i] % 2 != 0)
				count++;
		}
		return count;

	}

	// count no. of even elements

	public static int getEvenCount(int b[]) {
		return b.length - getOddCount(b);
	}
}

//Driver class
public class ArrayDemoOne {

	public static void main(String[] args) {
		int n=10;
		int a[]; //Declaration
		a=new int [n]; //Instantiation
		
		ArrayOperations.printArray(a);
		
		//assign the values
		for (int i=0;i<a.length;i++)
	
			a[i]=5*i;
		ArrayOperations.printArray(a);
		
		int b[]= {10,20,30,40,50};
		
		System.out.println(ArrayOperations.getSum(b));
		
		b[2]=67;
		ArrayOperations.printArray(b);
		/*
		 * b[7]=26; ArrayOperations.printArray(b);//RTE
		 */		
		//Odd and Even 
		
		int o=ArrayOperations.getOddCount(b);
		System.out.println("odd Numbers: "+o);
		

		int e=ArrayOperations.getEvenCount(b);
		System.out.println("Even Numbers: "+e);
		
		int c[];
		//ArrayOperations.printArray(c);//CTE
		
}
}

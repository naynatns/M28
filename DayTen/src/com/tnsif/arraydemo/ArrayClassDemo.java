package com.tnsif.arraydemo;

import java.util.Arrays;

public class ArrayClassDemo {

	public static void main(String[] args) {
		
		//Get the array
		int intArr[]= {10,2,30,999,88};
		
		//print the array
		System.out.println(Arrays.toString(intArr));
		
		Arrays.sort(intArr);
		for(int i=intArr.length-1;i>=0;i--)
		{
			System.out.println(intArr[i]);
		}
		
		System.out.println(Arrays.toString(intArr));
		
		int key=30;
		System.out.println("Key is present at index "+Arrays.binarySearch(intArr, key));
		
		System.out.println(Arrays.binarySearch(intArr, 1, 4, key));
		
		System.out.println(Arrays.toString(intArr));
		
		//Get second array 
		int intArr1[]= {2,10,30,88,999};
		System.out.println(Arrays.toString(intArr1));
		
		//Compare the arrays
		
		if(Arrays.compare(intArr, intArr1)==0)
		{
			System.out.println("Both the Arrays are equal");
		}
		else
		{
			System.out.println("Both the Arrays are not equal");
		}
		
		//copy array
		
		int intArr2[]=Arrays.copyOf(intArr, 10);
		
		System.out.println(Arrays.toString(intArr2));
		
		int intArr3[]=Arrays.copyOfRange(intArr, 2, 4);
		System.out.println(Arrays.toString(intArr3));
		
		//fill the arrays
		Arrays.fill(intArr3, 55);
		
		System.out.println(Arrays.toString(intArr3));


	}

}

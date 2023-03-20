package com.tnsif.daytwo;

public class NestedFor {

	public static void main(String[] args) {
		
		int beg=10;
		int end= 20;
		
		for(int i=beg;i<=end;i++){
			for(int j=1;j<=10;j++)
		{
			System.out.println(i*j);
		}
		
		System.out.println();
	}
	}
}



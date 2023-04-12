package com.tnsif.dayeleven.exceptiondemo;

public class NestedTryCatch {
	
	public static void check()
	{
		String str="TNSIF";
		int slength=str.length();
		
		System.out.println("String length is "+slength);
		
		String OneString=null;
		
		int y=6;
		
		try {
			//Inner Try block
		
		try {
			System.out.println(str.charAt(4));
		} catch (StringIndexOutOfBoundsException e) {
			System.err.println("Index is out of range "+e.getMessage());
			
		}
		
		System.out.println("Length of second String "+OneString.length());
		}
		catch(NullPointerException npe)
		{
			System.err.println("Exception is thrown .. "+npe.getMessage());

		}
	}

}

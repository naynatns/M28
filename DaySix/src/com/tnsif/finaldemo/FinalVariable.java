package com.tnsif.finaldemo;

public class FinalVariable {
	
	final int x=5;
	
	final static int y;
	
	final static int z=10;
	
	void change()
	{
		x=45;
		
		y=23;
	}
	static
	{
		y=30;
		z=67;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

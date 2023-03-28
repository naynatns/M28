package com.tnsif.pacakageone;

public class Base {
	
	int varDefault=10;
	public int varPublic=20;
	protected int varProtected=30;
	private int varPrivate=40;
	
	void methodDefault()
	{
		System.out.println("Default Method");
		System.out.println("Default Variable:"+varDefault);
	}
	
	public void methodPublic()
	{
		System.out.println("Public Method");
		System.out.println("Public Variable:"+varPublic);
	}
	
	
	protected void methodProtected()
	{
		System.out.println("Protected Method");
		System.out.println("Protected Variable:"+varProtected);
	}
	
	//
	public void callMethod()
		{
			
		methodProtected();
		//System.out.println("Protected Variable:"+varProtected);
		}
	private void methodPrivate()
	{
		System.out.println("Private Method");
		System.out.println("Private Variable:"+varPrivate);
	}
	
	
	

}

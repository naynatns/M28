package com.tnsif.dayfifteen.generics;

public class ConstructorGenericDemo {
	
	private double var;
	
	

	public <T extends Number>ConstructorGenericDemo(T v) {
		
		var = v.doubleValue();
	}
	
	public void display()
	{
		System.out.println("Variable is "+var);
	}



	public static void main(String[] args) {
		ConstructorGenericDemo gc=new ConstructorGenericDemo(23);
		gc.display();
		
		ConstructorGenericDemo gc1=new ConstructorGenericDemo(23.66F);
		gc.display();
		
		ConstructorGenericDemo gc2=new ConstructorGenericDemo(23);
		gc.display();
		
		
		

	}

}

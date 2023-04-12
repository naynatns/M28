package com.tnsif.abstractiondemo;

public abstract class Shape {
	
	protected float area;
	
	//abstract method
	abstract void calArea();
	
	//Concrete method
	void show()
	{
		System.out.println("Area of the shape is "+area);
	}

}

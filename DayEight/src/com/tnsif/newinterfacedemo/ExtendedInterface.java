package com.tnsif.newinterfacedemo;

public class ExtendedInterface implements ChildInterface {

	@Override
	public void print() {
	System.out.println("In print method");
		
	}

	@Override
	public void show() {
		System.out.println("In show method");
		
	}

}

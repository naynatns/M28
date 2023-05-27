package com.tnsif.lambdaexpdemo;

@FunctionalInterface
public interface Cube {
	
	int calculate(int a);  //only on abstract method
	
	//int sqr(int b);  not allowed

}

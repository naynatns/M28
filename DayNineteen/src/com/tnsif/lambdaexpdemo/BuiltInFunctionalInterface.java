package com.tnsif.lambdaexpdemo;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BuiltInFunctionalInterface {

	class Display {

		static void show(String s) {
			System.out.println("***** " + s + " ******");
		}
	}

	public static void main(String[] args) {
		
		//Supplier Functional Interface
		Supplier<String>  s=()->"Hello I am Supplier";
		System.out.println(s.get());
		
		Supplier<Integer>  s1=()->15+20;
		System.out.println(s1.get());
		
		//Consumer Functional Interface
		Consumer<String> con=(str)-> {System.out.println("Welcome "+str);};
		con.accept("Sudip");
		
		//second way
		con=System.out::println; //method reference
		con.accept("Faiz");
		
		//Third way
		con=Display::show;
		con.accept("Sikindra");
		
		//Predicate 
		
		Predicate<Integer> p=(num)->num>0;
		System.out.println(p.test(10));
		System.out.println(p.test(0));
		
		System.out.println(p.test(-10));
		
		//Function
		//max Test
		BiFunction<Integer,Integer,Integer> fun=(x,y)->x>y? x:y;
		System.out.println(fun.apply(30, 20));

		
		BiFunction<String,Integer,String> fun1=(name,num)->name + num;
		System.out.println(fun1.apply("Nayna", 20));
	}

}

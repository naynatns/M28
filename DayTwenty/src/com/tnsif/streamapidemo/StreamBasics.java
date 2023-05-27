package com.tnsif.streamapidemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamBasics {

	public static void main(String[] args) {
	
		//way-1-create a stream from set of values
		
		Stream<Integer> streamInt=Stream.of(10,20,30,40,50,60);
		
		//count the elements
		System.out.println(streamInt.count());
		
		//way 2 -Arrays
		Integer[]  values=new Integer[] {12,76,99,76,56,44,24,99,12,76};
		
		//streamInt=Arrays.stream(values);
		
		//map-intermediate method
		Arrays.stream(values).map(num->num*num*num).forEach(System.out::println);
		
		//limit
		System.out.println("*************");
		Arrays.stream(values).limit(4).forEach(System.out::println);
		
		//skip
		System.out.println("*************");
		Arrays.stream(values).skip(2).forEach(System.out::println);
		
		//distinct
		System.out.println("*************");
		Arrays.stream(values).distinct().forEach(System.out::println);
		
		//way 3 -Collection 
		List<String> words=Arrays.asList("Mumbai","Banglore","Nashik","Pune");
		
		
		List<String> s1=words.stream().map(str->str.toUpperCase()).collect(Collectors.toList());
		System.out.println(s1);
		
		

	}

}

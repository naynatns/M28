package com.tnsif.setdemo.builtinobjects;

import java.util.HashSet;
import java.util.Spliterator;

public class HashSetDemo {
	
	static void addElements(HashSet<Integer> hs1)
	{
		hs1.add(10);
		hs1.add(35);
		hs1.add(80);
		hs1.add(56);
		hs1.add(65);
		hs1.add(78);
		System.out.println(hs1.add(78)); //false
		
	}
	
	

	public static void main(String[] args) {
		
		//Unordered and unsorted set
		HashSet<Integer> hs=new HashSet<>();
		hs.add(10);
		hs.add(33);
		hs.add(80);
		hs.add(55);
		hs.add(65);
		hs.add(77);
		
		System.out.println("Elements of set1: "+hs);
		
		HashSet<Integer> hs1=new HashSet<>();
		addElements(hs1);
		
		System.out.println("Elements of set2: "+hs1);
		
		
		System.out.println("-------------------------------------");
		
		HashSet<Integer> hs2=new HashSet<>();
		addElements(hs2);
		
		//Union of the two sets
		
		hs2.addAll(hs);
		System.out.println("Set 2 "+hs2);
		System.out.println("Set 0 "+hs);
		
		//Intersection of union
		
		hs1.retainAll(hs);
		System.out.println("Set 2 after retainAll "+hs1);
		
		hs2.clear();
		addElements(hs2);
		
		
		
		//Set Difference
		
		hs2.removeAll(hs);
		System.out.println(hs2);
		
		//splitIterator
		Spliterator<Integer> spit=hs.spliterator();
		spit.forEachRemaining(System.out::println);

	}

}

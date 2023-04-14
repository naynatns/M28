package com.tnsif.buitinobjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		List list1 = new ArrayList(); // created list

		System.out.println("Size" + list1.size());
		// insertion
		list1.add(12);
		list1.add(45);
		list1.add("Nayna");
		list1.add(54.77f);
		list1.add(true);
		list1.add('A');
		list1.add(12);
		list1.add(null);
		list1.add(54.77f);

		System.out.println("List is:" + list1);

		// Searching
		System.out.println(list1.contains(55));

		// remove
		System.out.println(list1.remove(1));
		System.out.println("List is:" + list1);

		System.out.println(list1.remove(54.77f));
		System.out.println("List is:" + list1);

		System.out.println(list1.get(3));

		System.out.println(list1.remove(list1.lastIndexOf(12)));

		System.out.println("List is:" + list1);

		System.out.println(list1.remove(list1.indexOf(12)));
		System.out.println("List is:" + list1);

		// Collections.sort(list1); //RTE //ClassCastException

		list1.clear();
		System.out.println("List is:" + list1);
		System.out.println(list1.isEmpty());

		// Generics
		List<String> names = new ArrayList<>();

		names.add("Nayna");
		names.add("Niveditha");

		names.add("Divya");

		names.add("Pradhnya");
		names.add("Abdul");
		// names.add(78);

		System.out.println(names);
		// ascending
		Collections.sort(names);
		System.out.println(names);

		// Descending
		Collections.reverse(names);
		System.out.println(names);

		// traverse a list

		Iterator<String> i = names.iterator();

		while (i.hasNext()) {
			String nm = i.next();
			System.out.println(nm);

			if (nm.equals("Nayna"))
				i.remove();
		}

		System.out.println("Name list is "+names);
		
		
		System.out.println("--------------- Traversing a list in backward manner ---------------");
		ListIterator<String> li=names.listIterator(names.size());
		while(li.hasPrevious())
		{
			String nm = li.previous();
			System.out.println(nm);			
		}

	}

}

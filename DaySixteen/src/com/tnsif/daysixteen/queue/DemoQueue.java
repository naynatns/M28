package com.tnsif.daysixteen.queue;

import java.util.LinkedList;
import java.util.Queue;

public class DemoQueue {

	public static void main(String[] args) {
		
		Queue<Integer>  q=new LinkedList<>();
		
		//add elements
		for(int i=1;i<10;i++)
		{
		q.add(i);
		}
		
		//display elements
		System.out.println("Elements are:"+q);
		
		//remove elements
		System.out.println(q.remove());
		
		System.out.println("Elements are:"+q);

		System.out.println(q.peek());
		System.out.println("Elements are:"+q);
		
		
		int size=q.size();	
		System.out.println(size);

	}

}

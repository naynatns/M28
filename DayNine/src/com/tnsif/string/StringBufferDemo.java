package com.tnsif.string;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		
		//create obj of string buffer
		
		StringBuffer sb=new StringBuffer("Hello All");
		
		System.out.println(sb);
		
		//appending and inserting into stringBuffer
		sb.append('l');
		System.out.println(sb);
		
		sb.insert(5, 'o');
		System.out.println(sb);
		
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		
		sb.delete(2, 7);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		

	}

}

package com.tnsif.multithreadingdemo;

public class ThreadDemo {

	public static void main(String[] args) {
		
		ChildThread t1=new ChildThread(3,"Hi");
		ChildThread t2=new ChildThread(5,"Hey!!!!");
		ChildThread t3=new ChildThread(5,"Hellooooo");

		
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("------End of the main _______________");
		

	}

}

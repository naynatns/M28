package com.tnsif.multithreadingdemo;

public class UsingRunnable implements Runnable {

	Thread t;
	int high, low;
	String msg;

	// Constructor
	public UsingRunnable(int high, int low, String msg) {

		this.high = high;
		this.low = low;
		this.msg = msg;
		t = new Thread(this, "Child Thread"); // create Thread
		t.start(); // start the thread
	}

	@Override
	public void run() {
		for (int i=high;i>low;i--)
		{
			try
			{Thread.sleep(500);
		}catch(InterruptedException e)
			{
			System.out.println("Error.."+e.getMessage());
			}
		
		System.out.println(msg + i);

	}
	}
}

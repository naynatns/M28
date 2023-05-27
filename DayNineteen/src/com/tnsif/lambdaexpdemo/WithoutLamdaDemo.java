package com.tnsif.lambdaexpdemo;

interface Message
{
	public void greet(String name);
}




public class WithoutLamdaDemo {

	public static void main(String[] args) {
		
		//without Lambda exp
		Message msg=new Message()
				{

					@Override
					public void greet(String name) {
						System.out.println("Hello "+name);
											}
			
				};
				msg.greet("Niveditha");
		

				
				//Lambda Expression
				
				Message m=(name)->{System.out.println("Hi "+name);};
				m.greet("Ankita");
	}

}

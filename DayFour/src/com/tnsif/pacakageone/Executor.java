package com.tnsif.pacakageone;

public class Executor {

	public static void main(String[] args) {

		Base b=new Base();
		
		b.methodDefault();
		b.methodProtected();
		b.methodPublic();
		
		//b.methodPrivate();
		
		b.varDefault=11;
		b.varProtected=22;
		b.varPublic=33;
		
		b.methodDefault();
		b.methodProtected();
		b.methodPublic();
		
		
		
		Person p=new Person();
		
		System.out.println(b instanceof Base); //T or F
		
		//System.out.println(p instanceof Base); //incompatible type //CTE

	
		
		
		
	}

}

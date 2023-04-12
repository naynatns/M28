package com.tnsif.interfacedemo;

public class BankDemo {

	public static void main(String[] args) {
	SavingAccount nayna=new SavingAccount("Nayna", "Mumbai", 25, 101, 50000);
	System.out.println(nayna);
	
	nayna.deposit(10000);
	System.out.println(nayna);
	
	nayna.deposit(30000);
	System.out.println(nayna);
	
	nayna.withdraw(2000);
	System.out.println(nayna);
	
	nayna.withdraw(55000);
	System.out.println(nayna);
	
	}

}

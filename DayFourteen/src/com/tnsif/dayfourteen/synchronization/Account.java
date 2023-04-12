//Program to demonstrate Thread Synchronization - Account class
package com.tnsif.dayfourteen.synchronization;

public class Account implements Bank {
	private int accNo;
	private String Name;
	private double balance;

	
	//getter and setter
	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", Name=" + Name + ", balance=" + balance + "]";
	}
	
//Default Constructor
	public Account() {
		super();

	}

	//Parameterized  Constructor
	public Account(int accNo, String name, double balance) {
		this.accNo = accNo;
		Name = name;
		this.balance = balance;
	}

	@Override
	public synchronized void deposit(int amt) throws DepositLimitExceedsException {
		if (amt > 25000)
			throw new DepositLimitExceedsException("Daily limit exceeds...");
			
		else {
			balance += amt;
			System.out.println("Amount Deposited...." + amt);
		}

	}



	// Synchronized method

	@Override
	public synchronized void withdraw(int amt) throws InsufficientBalanceException {

		if (balance - amt < MINBAL)
			throw new InsufficientBalanceException();
		else {
			balance = balance - amt;
			System.out.println("after withdrwing Rs." + amt + " current Balance : Rs." + balance);
		}
	}

}

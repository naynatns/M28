package com.tnsif.interfacedemo;

public class SavingAccount extends Customer implements Bank {
	// data member
	private int accNo;
	private float balance;

	// Parameterized Constructor
	public SavingAccount(String name, String city, int age, int accNo, float balance) {
		super(name, city, age);
		this.accNo = accNo;
		this.balance = balance;
	}

	// getter and setter
	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	@Override
	public void deposit(float amount) {

		if (amount > DEPOSIT_LIMIT) {
			System.out.println("Rs " + amount + "exceeds the limit");
		} else {
			balance += amount;
			System.out.println("Rs " + amount + "is deposited");
		}
	}

	@Override
	public void withdraw(float amount) {
		if(amount<=balance-MINBAL)
		{
			balance-=amount;
			System.out.println("Minimum balance");
		}
		else
		{
			System.out.println("Minimum balance");
		}

	}

	@Override
	public String toString() {
		return "SavingAccount [accNo=" + accNo + ", balance=" + balance + ", getName()=" + getName() + ", getCity()="
				+ getCity() + ", getAge()=" + getAge() + "]";
	}
	
	

}

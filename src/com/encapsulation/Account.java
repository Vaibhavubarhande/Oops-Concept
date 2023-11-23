package com.encapsulation;

public class Account {

	private String AccountHolderName;
	private String accNo;
	private float balance;
	private int age;

	public void setBalance(float balance) {
		if (balance < 5000) {
			System.err.println("Invalid Balance. Balance must be atleast 5000");
		} else {
			this.balance = balance;
			System.out.println("Your balance is: " + balance);
		}
	}
	public float getBalance() {

		return balance;
	}
}

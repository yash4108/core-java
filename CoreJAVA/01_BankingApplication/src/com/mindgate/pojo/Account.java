package com.mindgate.pojo;

 public abstract class Account extends Object {
    // instance variables
	private int accountNumber;
	private String name;
	private double balance;
	
    //Default Constructor
	public Account() {

	}

	//Parameterized Constructor
	public Account(int accountNumber, String name, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}
	
	//Withdraw Method
	public boolean withdraw(double amount) {
		if (amount>0 && amount<= balance) {
			balance = balance - amount;
			return true;
		}
		return false;
	}

	//Deposit Method 
	public boolean deposit(double amount) {
		if (amount>0 ) {
			balance = balance + amount;
			return true;
		}
		return false;
	}
	
    //getter
	public int getAccountNumber() {
		return accountNumber;
	}

	//setter
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	//getter
	public String getName() {
		return name;
	}

	//setter
	public void setName(String name) {
		this.name = name;
	}

	//getter
	public double getBalance() {
		return balance;
	}

	//setter
	public void setBalance(double balance) {
		this.balance = balance;
	}

	//Override toString();
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
	
}
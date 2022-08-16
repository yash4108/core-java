package com.mindgate.pojo;

public class Current extends Account {
	private double overdraftBalance;
	boolean isoverdraft;
private double intialOverdraftBalance;
	public Current() {

	}

	public Current(int accountNumber, String name, double balance, double overdraftBalance) {
		super(accountNumber, name, balance);
		this.overdraftBalance = overdraftBalance;
		intialOverdraftBalance =overdraftBalance;
	}

	@Override
	public boolean withdraw(double amount) {

		if (amount > 0 && amount <= getBalance()) {
			setBalance(getBalance() - amount);

			return true;
		} else if (getBalance() < amount && amount > 0 && amount < getBalance() + overdraftBalance) {
			amount = amount - getBalance();
			setBalance(0);
			setOverdraftBalance(getOverdraftBalance() - amount);
			return true;
		}
		return false;
	}

	@Override
	public boolean deposit(double amount) {
		if (amount > 0) {
			if(overdraftBalance<intialOverdraftBalance) {
			double difference= intialOverdraftBalance- overdraftBalance;
			if(difference<amount)
			{amount =amount - difference;
			overdraftBalance=intialOverdraftBalance;
			setBalance(getBalance()+amount);
				return true;
		} else   {overdraftBalance=overdraftBalance+amount;
			
			return true;
		} } else { setBalance((getBalance()+amount));
		return true;
		}}
		return false;
	
		}
	public double getOverdraftBalance() {
		return overdraftBalance;
	}

	public void setOverdraftBalance(double overdraftBalance) {
		this.overdraftBalance = overdraftBalance;
	}

}

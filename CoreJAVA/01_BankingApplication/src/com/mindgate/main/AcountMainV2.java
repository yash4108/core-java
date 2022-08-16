package com.mindgate.main;

import com.mindgate.pojo.Account;

public class AcountMainV2 {
	public static void main(String[] args) {
		System.out.println("This is AcountMainV2");
		
		Account account = new Account(103, "Test", 1000);
		
		System.out.println("Withdraw :: 500");
		
		if (account.withdraw(500)) 
			System.out.println("Transaction Success!!");
		else
			System.out.println("Transaction Failed!!");
		
		System.out.println("Balance : " + account.getBalance());
		
	}

}

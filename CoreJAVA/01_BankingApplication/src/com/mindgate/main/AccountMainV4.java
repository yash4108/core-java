package com.mindgate.main;

import java.util.Scanner;
import com.mindgate.pojo.*;

public class AccountMainV4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your Account Number");
		int accountNumber = scanner.nextInt();

		System.out.println("Enter your Name");
		scanner.nextLine();
		String name = scanner.nextLine();

		System.out.println("Enter your Balance");
		double balance = scanner.nextDouble();
		
		System.out.println("Do you want to open salary account ");
		boolean isSalary = scanner.nextBoolean();

		Savings account = new Savings(accountNumber, name, balance, isSalary);

		System.out.println(account);
		
        do {
        	System.out.println("Enter your choice");
    		System.out.println("1 for withdraw");
    		System.out.println("2 for deposit");
    		System.out.println("3 for balance");
    		
		switch (scanner.nextInt()) {
		case 1:
			System.out.println("Enter the amount to be withdraw");
			double amount = scanner.nextDouble();
			if (account.withdraw(amount))
				System.out.println("Transaction Success!!");
			else
				System.out.println("Transaction Failed!!");

			System.out.println("Balance : " + account.getBalance());
			break;
			
		case 2:
			System.out.println("Enter the amount to be deposit");
			double amount1 = scanner.nextDouble();
			if (account.deposit(amount1))
				System.out.println("Transaction Success!!");
			else
				System.out.println("Transaction Failed!!");

			System.out.println("Balance : " + account.getBalance());
			break;
			
		case 3:
			System.out.println("Balance : " + account.getBalance());
			break;
			
		default :
			System.out.println("Invalid choice");
		}
		System.out.println("If want to continue press 1");
        }
        while(scanner.nextInt()==1);

	}
}

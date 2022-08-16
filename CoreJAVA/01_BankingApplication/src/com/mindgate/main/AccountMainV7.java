package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.factory.AccountFactory;
import com.mindgate.pojo.Account;
import com.mindgate.pojo.Current;
import com.mindgate.pojo.Savings;

public class AccountMainV7 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	AccountFactory a=new AccountFactory();
	System.out.println("press 1.savings");
	System.out.println("press 2.savings");
	System.out.println("enter your choice");
	int choice=scanner.nextInt();
	Account account=a.getAccount(choice);
if(account instanceof Savings)
{
	System.out.println("savings Object Created");
}
if(account instanceof Current)
{
	System.out.println("current Object Created");
}
}
}

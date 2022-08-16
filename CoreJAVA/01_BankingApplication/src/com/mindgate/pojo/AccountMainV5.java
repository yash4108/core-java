package com.mindgate.pojo;

public class AccountMainV5 {
	public static void main(String[] args) {
Current current=new Current(101, "yash", 10000, 50000);

System.out.println("withdraw:5000");
current.withdraw(5000);
System.out.println("balance:"+current.getBalance()+"overdraft:"+current.getOverdraftBalance());
System.out.println();

System.out.println("withdraw:15000");
current.withdraw(15000);
System.out.println("balance:"+current.getBalance()+"overdraft:"+current.getOverdraftBalance());
System.out.println();

System.out.println("deposit:5000");
current.deposit(5000);
System.out.println("balance:"+current.getBalance()+"overdraft:"+current.getOverdraftBalance());
System.out.println();

System.out.println("deposit:5000");
current.deposit(10000);
System.out.println("balance:"+current.getBalance()+"overdraft:"+current.getOverdraftBalance());
System.out.println();


	}
}

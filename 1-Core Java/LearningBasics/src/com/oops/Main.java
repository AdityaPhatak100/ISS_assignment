package com.oops;

/* 
 * Concepts covered:	2. modifier types
 * 						5. abstraction, encapsulation, packages	
 */

public class Main {

	public static void main(String[] args) {

		// account balance is private, and can only be viewed through getter
		// and setter methods. in our case, withdraw, deposit and check.
		SavingsAccount user1 = new SavingsAccount("Aditya");

		System.out.println("Balance: " + user1.checkBalance());

		user1.withdrawAmount(5000);
		user1.depositAmount(10000);

		System.out.println("Balance: " + user1.checkBalance());

		user1.withdrawAmount(2500);

		System.out.println("Balance: " + user1.checkBalance());
	}
}

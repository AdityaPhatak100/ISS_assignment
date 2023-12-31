package com.oops;

/* 
 * Concepts covered:	5. Interface 					 	
 */

interface CashAccount {
	void withdrawMoney();

	void depositMoney();

}

public class InterfaceExample implements CashAccount {

	public String name;

	InterfaceExample(String name) {
		this.name = name;
	}

	@Override
	public void withdrawMoney() {
		System.out.println("Money Withdrawn.");
	}

	@Override
	public void depositMoney() {
		System.out.println("Money Deposited.");

	}

	public static void main(String[] args) {
		InterfaceExample user1 = new InterfaceExample("Aditya");
		user1.depositMoney();
		user1.withdrawMoney();
	}
}

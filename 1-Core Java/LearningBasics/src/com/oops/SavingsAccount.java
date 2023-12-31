package com.oops;

/* 
 * Concepts covered:	abstract classes					 	
 */
abstract class BankAccount {

	protected String accountHolderName;

	BankAccount(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public abstract boolean depositAmount(float amount);

	public abstract boolean withdrawAmount(float amount);

	public abstract double checkBalance();

}

class SavingsAccount extends BankAccount {

	private float accountBalance = 0;

	SavingsAccount(String accountHolderName) {
		super(accountHolderName);
	}

	@Override
	public boolean depositAmount(float amount) {
		this.accountBalance += amount;
		System.out.println(String.format("%f deposited.", amount));
		return true;
	}

	@Override
	public boolean withdrawAmount(float amount) {
		if (this.accountBalance - amount < 0) {
			System.out.println("Withdrawal failed. Insufficient Funds");
			return false;
		}
		this.accountBalance -= amount;
		System.out.println(String.format("%f withdrawn.", amount));
		return true;
	}

	@Override
	public double checkBalance() {
		return this.accountBalance;
	}
}
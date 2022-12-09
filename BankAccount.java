package models;

public class BankAccount {
	private double checkingBalance = 0.0;
	private double savingsBalance = 0.0;
	private static int numberOfAccounts = 0;
	private static double bankTotal = 0.0;
	public BankAccount() {
		numberOfAccounts++;
	};
	public BankAccount(double checkingBalance, double savingsBalance) {
		this.checkingBalance = checkingBalance;
		this.savingsBalance = savingsBalance;
		numberOfAccounts++;
	}
	
	public void depositToChecking(double amount) {
		this.checkingBalance += amount;
		bankTotal += amount;
	}
	
	public void depositToSavings(double amount) {
		this.savingsBalance += amount;
		bankTotal += amount;
	}
	
	public void withdrawFromChecking(double amount) {
		if (amount <= this.checkingBalance) {			
			this.checkingBalance -= amount;
			bankTotal -= amount;
		} else {
			System.out.printf("Insufficient funds. Current account balance: %,.2f", this.checkingBalance);
		}
	}
	
	public void withdrawFromSavings(double amount) {
		if (amount <= this.savingsBalance) {			
			this.savingsBalance -= amount;
			bankTotal -= amount;
		} else {
			System.out.printf("Insufficient funds. Current account balance: %,.2f", this.savingsBalance);
		}
	}
	
	public String viewBalance() {
		return ("Total balance: $" + (this.savingsBalance + this.checkingBalance));
	}
	
	public double getCheckingBalance() {
		return checkingBalance;
	}
	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}
	public double getSavingsBalance() {
		return savingsBalance;
	}
	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	public static double getBankTotal() {
		return bankTotal;
	}
	public static void setBankTotal(double bankTotal) {
		BankAccount.bankTotal = bankTotal;
	}
	public static int getNumberOfAccounts() {
		return numberOfAccounts;
	}
	
}

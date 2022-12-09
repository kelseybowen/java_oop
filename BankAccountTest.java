package main;

import models.BankAccount;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount();
		account1.depositToChecking(100.0);
		account1.depositToSavings(20.0);
		System.out.println("Bank total: " + BankAccount.getBankTotal());
		System.out.println("Number of accounts: " + BankAccount.getNumberOfAccounts());
		
//		System.out.println(account1.viewBalance());
//		account1.withdrawFromChecking(50.0);
//		account1.withdrawFromSavings(50.0);
//		System.out.println(account1.viewBalance());
	}

}

package com.training;

public class Application3 {

	public static void main(String[] args) {
		SavingsAccount sonnyBankAcc = new SavingsAccount(1, "Sonny", 1000, "Frank");
		sonnyBankAcc.deposit(500);
		sonnyBankAcc.widthdraw(10000);
		sonnyBankAcc.deposit(500000);
		sonnyBankAcc.widthdraw(10000);
		sonnyBankAcc.getNomname();
	}

}

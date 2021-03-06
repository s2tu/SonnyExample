package com.training;

public class BankAccount {
	private int accountNumber;
	private String accountHolderName;
	private double balance;
	public BankAccount(){
	}
	public BankAccount(int accNumber, String accholdername, double bal){
		accountNumber = accNumber;
		accountHolderName = accholdername;
		balance  = bal;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount){
		if(amount < 0 ){
			System.out.println("Deposit rejected. Cannot deposit negative number.");
			System.out.println("The balance returned is " + balance);
			return;
		}
		balance = balance  + amount;
		System.out.println("The balance returned is " + balance);
	}
	public double widthdraw(double amount){
		if(amount < 0 ){
			System.out.println("Withdraw rejected. Cannot widthdraw negative number.");
			System.out.println("The balance returned is " + balance);
			return balance;
		}		
		if (balance - amount > 0 ){
			balance = balance - amount;
			System.out.println("The balance  is " + balance);
			
			return balance - amount;
		}else{
			System.out.println("The balance  is " + balance);
			return  balance;
		}
	}
}

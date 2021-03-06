package com.domains;

import java.util.ArrayList;

import exceptions.InsufficientBalanceException;
import exceptions.InvalidInputException;

public class BankAccount {
	private String accountHolder; 
	private long accountNumber;
	private double balance;
	private ArrayList<String> passBook;

	/**
	 * @param accountHolder
	 * @param accountNumber
	 * @param balance
	 */
	public BankAccount(String accountHolder, long accountNumber, double balance) {
		super();
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.passBook = new ArrayList<String>();
	}
	private void addStatement(){
		String statement = "AccountHolder:" + accountHolder +
				"\nAccountNumber:" + accountNumber +
				"\nBalance:" + balance;  
		passBook.add(statement);
	}
	
	public Double deposit(double amountDeposited) throws InvalidInputException{
		if(amountDeposited < 0){
			throw new InvalidInputException();
		}else{
			balance = balance + amountDeposited;
			addStatement();
			return balance;
		}
		
	}
	public Double withdraw(double amountWithdrawn) throws InsufficientBalanceException, InvalidInputException{
		if(amountWithdrawn < 0){
			throw new InvalidInputException();
		}
		if (balance - amountWithdrawn< 0){
		  throw new InsufficientBalanceException();	
		}
		balance = balance - amountWithdrawn;
		addStatement();
		return balance;
	}
	public String PrinterStatement(){
		String output = "";
		for(String statement:passBook){
			output = output + statement;
		}
		return output;
	}
	
}

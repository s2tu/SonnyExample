package com.training;

public class SavingsAccount extends BankAccount{
	String nomname;
	public SavingsAccount(int accNumber, String accholdername, int bal, String nom) {
		super(accNumber, accholdername, bal);
		nomname = nom;
	}
	public String getNomname(){
		System.out.println("Your nominee is " + nomname);
		return nomname;
	}
	public void setNomname(String nomineeName){
		nomname = nomineeName;
	}
	@Override
	public double widthdraw(double amount) {
		// TODO Auto-generated method stub
		//min balance 
		//if 
		if(amount < 0 ){
			System.out.println("Withdraw rejected. Cannot widthdraw negative number.");
			System.out.println("The balance returned is " + getBalance());
			return getBalance();
		}		
		double minbal = 600;
		if(getBalance() - amount < minbal ){
			System.out.println("Minimum balance not reached.  Widthdraw denied.");
			System.out.println("The balance  is " + getBalance());
			return getBalance();
		}
		return widthdraw(amount);
	}
	
}

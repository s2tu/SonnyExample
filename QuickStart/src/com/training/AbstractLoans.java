package com.training;

public abstract class AbstractLoans {
	//eligibility for loan
	//calculate interest
	
	private double numyears;
	private double loanamount;
	
	public abstract double calculate_eligibility();
	public abstract double calculate_interest();
	
	public double getNumyears() {
		return numyears;
	}
	public void setNumyears(double numyears) {
		this.numyears = numyears;
	}
	public double getLoanamount() {
		return loanamount;
	}
	public void setLoanamount(double loanamount) {
		this.loanamount = loanamount;
	}
	
	public void printDetails(){
		System.out.println("Eligibility for "+ this.getClass().getSimpleName()  +"= "+   calculate_eligibility());
		System.out.println("Interest for "+ this.getClass().getSimpleName()  +"= "+   calculate_interest());		
	}
}

package com.training;

public class GoldLoan extends AbstractLoans{
	private double gramofgold;

	public GoldLoan(double gramgold, double numberyears){
		gramofgold = gramgold;
		setNumyears(numberyears);
	}
	
	@Override
	public double calculate_eligibility() {
		// TODO Auto-generated method stub
		double rupies = 2000;
		setLoanamount(rupies*gramofgold);
		return getLoanamount();
	}

	@Override
	public double calculate_interest() {
		// TODO Auto-generated method stub
		double interest = 0.024;	
		double total = getLoanamount();
		for (int i =0; i < getNumyears(); i++){
			total = total + total*interest;	
		}
		return total;
	}
	
}

package com.training;

public class LandLoan extends AbstractLoans{
	private double landvalue;

	LandLoan(double landval, double numberyears){
		landvalue = landval;
		setNumyears(numberyears);
	}
	
	@Override
	public double calculate_eligibility() {
		// TODO Auto-generated method stub
		double interestonland = 0.20;
		setLoanamount(landvalue*interestonland);
		return getLoanamount();
	}

	@Override
	public double calculate_interest() {
		// TODO Auto-generated method stub
		double interest = 0.029;	
		double total = getLoanamount();
		for (int i =0; i < getNumyears(); i++){
			total = total + total*interest;	
		}
		return total;
	}

}

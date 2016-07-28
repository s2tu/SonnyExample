package com.training;

public class VehicleLoan extends AbstractLoans {
	private double costofvehicle;

	VehicleLoan(double costvehicle, double numberyears){
		costofvehicle = costvehicle;
		setNumyears(numberyears);
	}
	
	@Override
	public double calculate_eligibility() {
		// TODO Auto-generated method stub
		double depricationonvehical = 0.90;
		setLoanamount(costofvehicle*depricationonvehical);
		return getLoanamount();
	}

	@Override
	public double calculate_interest() {
		// TODO Auto-generated method stub
		double interest = 0.035;	
		double total = getLoanamount();
		for (int i =0; i < getNumyears(); i++){
			total = total + total*interest;	
		}
		return total;
	}
	
}

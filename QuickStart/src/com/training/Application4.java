package com.training;

public class Application4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LandLoan sonnylandloan = new LandLoan(100,5);
		VehicleLoan sonnyvehicleloan = new VehicleLoan(100,5);
		GoldLoan sonnygoldloan = new GoldLoan(100,5);
		//polymorphism
		sonnylandloan.printDetails();
		sonnyvehicleloan.printDetails();
		sonnygoldloan.printDetails();
			
	}

}

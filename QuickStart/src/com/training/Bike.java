package com.training;
/*
 * Adding bike automobile
 */
public class Bike implements IAutomobile{
	/**
	 *  returns price
	 */
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 700000000.00D;
	}
	/**
	 * return color
	 */
	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "White";
	}
	/**
	 * return model
	 */
	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "COOL BIKE";
	}
}
package com.training;
/**
 * 
 * @author stu1
 *
 */
public class ToyotaCar implements IAutomobile{
	/**
	 * returns price
	 */
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 600000.00D;
	}
	/**
	 * returns color
	 */
	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "White";
	}
	/**
	 * returns model
	 */
	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Corrola";
	}
}
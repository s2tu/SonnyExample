package com.training;

//this is a check exception 
public class RangeCheckException extends Exception{
	private long bookNumber;
	public RangeCheckException(long bookNumber){
		super();
		this.bookNumber = bookNumber;
	}
	@Override
	public String getMessage(){
		return this.bookNumber+ "should be in the range of 1000-10000";
	}
	
}

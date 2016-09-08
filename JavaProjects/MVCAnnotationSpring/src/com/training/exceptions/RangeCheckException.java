package com.training.exceptions;


public class RangeCheckException extends Exception {

  private int rollNumber;

  public RangeCheckException(int rollNumber) {
    super();
    this.rollNumber = rollNumber;
  }

  @Override
  public String getMessage() {
    return this.rollNumber + "should be 1-1000";
  }

} 


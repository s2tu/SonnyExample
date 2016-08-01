package com.training.lab;

/**
 * 
 * @author stu1
 *This exception is if the user enters a input that isn't apart of the listed options of the InputSystem
 */
public class InvalidInputException extends Exception {
  static private String message= "Error: Invalid Input";
  public InvalidInputException(){
    super(message);
  }
}

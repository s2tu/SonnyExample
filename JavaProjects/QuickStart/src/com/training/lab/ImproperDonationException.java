package com.training.lab;
/**
 * 
 * @author stu1
 * This is for donation that exceeds the pending amount of the project/product.
 */
public class ImproperDonationException extends Exception{
  private static String message  = "The Pending Cost For Project/Product Has Reached 0.\n";
  public ImproperDonationException(){
    super(message);		
  }

}

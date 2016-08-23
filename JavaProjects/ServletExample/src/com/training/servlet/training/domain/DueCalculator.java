package com.training.servlet.training.domain;
//model
import java.util.*;

public class DueCalculator {
  
  private HashMap<Long, Double> dueDetails;

  public DueCalculator() {
    super();
    dueDetails = new HashMap<Long, Double>();
  }
  
  private void init(){
    dueDetails.put(123456789L, 500.00d);
    dueDetails.put(223456789L, 1500.00d);
    dueDetails.put(323456789L, 2500.00d);
    dueDetails.put(423456789L, 3500.00d);
  }
  
  public Double findDue(Long phoneNumber) {
	init(); 
    Double result = dueDetails.get(phoneNumber);
    
    return result;
  }
  
} 

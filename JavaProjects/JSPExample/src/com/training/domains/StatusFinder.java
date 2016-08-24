package com.training.domains;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class StatusFinder {
	
	private HashMap<Long, List<PaymentStatus>> phonenumToPayStatus;
	public StatusFinder(){
		this.phonenumToPayStatus = new HashMap<Long, List<PaymentStatus>>();
		init();
	}
	
	public List<PaymentStatus> getPayStatus(Long phonenumber){
		return phonenumToPayStatus.get(phonenumber);		
	}
	
	public void init(){
		phonenumToPayStatus.put((long) 12345678, Arrays.asList(new PaymentStatus(1,(new Timestamp((new Date()).getTime())), "Test", 50), new PaymentStatus(2,(new Timestamp((new Date()).getTime())), "Test2", 70)));	
	}
}

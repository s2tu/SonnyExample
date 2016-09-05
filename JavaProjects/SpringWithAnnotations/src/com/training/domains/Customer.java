package com.training.domains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//defines the id of the bean
@Component("cust")
public class Customer {
	private long custId;
	private String customerName;

	/**
	 * @return the custId
	 */
	public long getCustId() {
		return custId;
	}
	/**
	 * @param custId the custId to set
	 */
	public void setCustId(long custId) {
		this.custId = custId;
	}
	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}
	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	/**
	 * 
	 */
	public Customer() {
		super();
	}
	/**
	 * @param custId
	 * @param customerName
	 */
	@Autowired
	public Customer(@Value("2020") long custId, @Value("Ramesh") String customerName) {
		super();
		this.custId = custId;
		this.customerName = customerName;
	}
	
}

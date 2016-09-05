package com.training.entity;

import org.springframework.stereotype.Component;

@Component("cust")
public class Customer {

	/**
	 * @return the customerNumber
	 */
	public long getCustomerNumber() {
		return customerNumber;
	}
	/**
	 * @param customerNumber the customerNumber to set
	 */
	public void setCustomerNumber(long customerNumber) {
		this.customerNumber = customerNumber;
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
	 * @return the email_id
	 */
	public String getEmail_id() {
		return email_id;
	}
	/**
	 * @param email_id the email_id to set
	 */
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	/**
	 * @return the phonenumber
	 */
	public long getPhonenumber() {
		return phonenumber;
	}
	/**
	 * @param phonenumber the phonenumber to set
	 */
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	/**
	 * @param customerNumber
	 * @param customerName
	 * @param email_id
	 * @param phonenumber
	 */
	public Customer(long customerNumber, String customerName, String email_id, long phonenumber) {
		super();
		this.customerNumber = customerNumber;
		this.customerName = customerName;
		this.email_id = email_id;
		this.phonenumber = phonenumber;
	}
	/**
	 * 
	 */
	public Customer() {
		super();
	}
	private long customerNumber;
	private String customerName;
	private String email_id;
	private long phonenumber;
	
	
	public String toString(){
		return this.customerNumber + " " + this.customerName + " " + this.email_id + " " + this.phonenumber;
	}

}

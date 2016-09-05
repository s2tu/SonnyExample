package com.training.domains;




//defines the id of the bean

public class Customer {
	private long custId;
	private String customerName;
	private Address addr;
	/**
	 * @return the custId
	 */
	public long getCustId() {
		return custId;
	}
	/**
	 * @return the addr
	 */
	public Address getAddr() {
		return addr;
	}
	/**
	 * @param addr the addr to set
	 */
	public void setAddr(Address addr) {
		this.addr = addr;
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
	/**
	 * @param custId
	 * @param customerName
	 * @param addr
	 */
	public Customer(long custId, String customerName, Address addr) {
		super();
		this.custId = custId;
		this.customerName = customerName;
		this.addr = addr;
	}

	public String toString(){
	
		return "CUSTOMER\n  custID:" + this.custId + "\n  Name: " + this.customerName + "\n  " + this.addr;
	}
	
}

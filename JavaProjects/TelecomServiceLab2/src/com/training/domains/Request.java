package com.training.domains;

public class Request {
	
	private String requestType;
	private int requestID;
	private String description;
	private int customerID;
	/**
	 * @return the requestType
	 */
	public String getRequestType() {
		return requestType;
	}
	/**
	 * @param requestType the requestType to set
	 */
	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}
	/**
	 * @return the requestID
	 */
	public int getRequestID() {
		return requestID;
	}
	/**
	 * @param requestID the requestID to set
	 */
	public void setRequestID(int requestID) {
		this.requestID = requestID;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the customerID
	 */
	public int getCustomerID() {
		return customerID;
	}
	/**
	 * @param customerID the customerID to set
	 */
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	/**
	 * @param requestType
	 * @param requestID
	 * @param description
	 * @param customerID
	 */
	public Request(String requestType, int requestID, String description, int customerID) {
		super();
		this.requestType = requestType;
		this.requestID = requestID;
		this.description = description;
		this.customerID = customerID;
	}
	/**
	 * 
	 */
	public Request() {
		super();
	}

	public String toString(){
		
		return "Request ID:" + this.requestID  + " Request Type:"  + this.requestType  + " Description:" + this.description + " Customer ID:" + this.customerID; 
	}
}

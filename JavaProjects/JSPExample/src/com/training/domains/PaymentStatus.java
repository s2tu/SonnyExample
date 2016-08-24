package com.training.domains;

import java.sql.Timestamp;


public class PaymentStatus {
	
	private int transactionID;
	private Timestamp transactionDate;
	private String description;
	private double amount;
	
	
	
	/**
	 * @param transactionID
	 * @param transactionDate
	 * @param description
	 * @param amount
	 */
	public PaymentStatus(int transactionID, Timestamp transactionDate, String description, double amount) {
		super();
		this.transactionID = transactionID;
		this.transactionDate = transactionDate;
		this.description = description;
		this.amount = amount;
	}
	
	
	/**
	 * @return the transactionID
	 */
	public int getTransactionID() {
		return transactionID;
	}
	/**
	 * @param transactionID the transactionID to set
	 */
	public void setTransactionID(int transactionID) {
		this.transactionID = transactionID;
	}
	/**
	 * @return the transactionDate
	 */
	public Timestamp getTransactionDate() {
		return transactionDate;
	}
	/**
	 * @param transactionDate the transactionDate to set
	 */
	public void setTransactionDate(Timestamp transactionDate) {
		this.transactionDate = transactionDate;
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
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	//transactionId,transactionDate,description,amount
}

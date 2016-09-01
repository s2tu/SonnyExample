package com.training.resources;

import java.io.Serializable;

public class Invoice implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int invoiceNumber;
	private String accountname;
	//private  double  amount2;
	private transient double  amount;
	
	public Invoice(){
		super();
	}
	/**
	 * @param invoiceNumber
	 * @param customerName
	 * @param amount
	 */
	public Invoice(int invoiceNumber, String customerName, double amount) {
		super();
		this.invoiceNumber = invoiceNumber;
		this.accountname = customerName;
		this.amount = amount;
	}
	/**
	 * @return the invoiceNumber
	 */
	public int getInvoiceNumber() {
		return invoiceNumber;
	}
	/**
	 * @param invoiceNumber the invoiceNumber to set
	 */
	public void setInvoiceNumber(int invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	/**
	 * @return the accountname
	 */
	public String getAccountname() {
		return accountname;
	}
	/**
	 * @param accountname the accountname to set
	 */
	public void setAccountname(String accountname) {
		this.accountname = accountname;
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
	@Override
	public String toString(){
		return  this.invoiceNumber + ":" + this.accountname + ":" + this.amount ;
	}
	
}

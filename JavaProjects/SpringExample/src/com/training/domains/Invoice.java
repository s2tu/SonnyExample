package com.training.domains;

import java.util.List;

public class Invoice {
	private long invoiceNumber;
	private Customer cust;
	private double amount;
	private List<Item>itemList;
	/**
	 * 
	 */
	public Invoice() {
		super();
	}
	/**
	 * @return the invoiceNumber
	 */
	public long getInvoiceNumber() {
		return invoiceNumber;
	}
	/**
	 * @param invoiceNumber the invoiceNumber to set
	 */
	public void setInvoiceNumber(long invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	/**
	 * @return the cust
	 */
	public Customer getCust() {
		return cust;
	}
	/**
	 * @param cust the cust to set
	 */
	public void setCust(Customer cust) {
		this.cust = cust;
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
	/**
	 * @return the itemList
	 */
	public List<Item> getItemList() {
		return itemList;
	}
	/**
	 * @param itemList the itemList to set
	 */
	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}
	
	public String toString(){
		
		String itemsList = "";
	
		for(Item i:itemList){
			itemsList = itemsList + " " + i+ "\n";
			
		}
		return "INVOICE\n Invoice Number:" + this.invoiceNumber + "\n Invoice Amount:" +  + this.amount+ "\n " + this.cust+  "\n" + itemsList  ;
	}
	/**
	 * @param invoiceNumber
	 * @param cust
	 * @param amount
	 * @param itemList
	 */
	public Invoice(long invoiceNumber, Customer cust, double amount, List<Item> itemList) {
		super();
		this.invoiceNumber = invoiceNumber;
		this.cust = cust;
		this.amount = amount;
		this.itemList = itemList;
	}
	
	public void init(){
		System.out.println("Init it called--------");
	}
	
	public void cleanUp(){
		System.out.println("Resources now being cleaned up--------");
	}
}

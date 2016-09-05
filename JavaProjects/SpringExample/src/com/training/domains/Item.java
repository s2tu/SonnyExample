package com.training.domains;

public class Item {
	private String itemName;
	private int itemNumber;
	private double itemRate;
	/**
	 * @param itemName
	 * @param itemNumber
	 * @param itemDouble
	 */
	public Item(String itemName, int itemNumber, double itemRate) {
		super();
		this.itemName = itemName;
		this.itemNumber = itemNumber;
		this.itemRate = itemRate;
	}
	/**
	 * 
	 */
	public Item() {
		super();
	}
	/**
	 * @return the itemName
	 */
	public String getItemName() {
		return itemName;
	}
	/**
	 * @param itemName the itemName to set
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	/**
	 * @return the itemNumber
	 */
	public int getItemNumber() {
		return itemNumber;
	}
	/**
	 * @param itemNumber the itemNumber to set
	 */
	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}
	/**
	 * @return the itemDouble
	 */
	public double getitemRate() {
		return itemRate;
	}
	/**
	 * @param itemDouble the itemDouble to set
	 */
	public void setitemRate(double itemRate) {
		this.itemRate = itemRate;
	}
	
	public String toString(){
		return "ITEM" + "\n  Item Name:" + this.itemName +  "\n  Item Number:"  +this.itemNumber + "\n  Item Rate:" + this.itemRate;   
	}
}

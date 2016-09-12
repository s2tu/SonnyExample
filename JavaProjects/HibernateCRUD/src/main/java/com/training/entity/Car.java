package com.training.entity;

import com.training.domains.Address;

public class Car {
	private String registerNumber;
	private String ownerName;
	private Address officeAddr;
	private Address resiAddr;


	/**
	 * @return the registerNumber
	 */
	public String getRegisterNumber() {
		return registerNumber;
	}
	/**
	 * @param registerNumber the registerNumber to set
	 */
	public void setRegisterNumber(String registerNumber) {
		this.registerNumber = registerNumber;
	}
	/**
	 * @return the ownerName
	 */
	public String getOwnerName() {
		return ownerName;
	}
	/**
	 * @param ownerName the ownerName to set
	 */
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	/**
	 * 
	 */
	public Car() {
		super();
	}

	/**
	 * @param registerNumber
	 * @param ownerName
	 * @param officeAddr
	 * @param resiAddr
	 */
	public Car(String registerNumber, String ownerName, Address officeAddr, Address resiAddr) {
		super();
		this.registerNumber = registerNumber;
		this.ownerName = ownerName;
		this.officeAddr = officeAddr;
		this.resiAddr = resiAddr;
	}
	/**
	 * @return the officeAddr
	 */
	public Address getOfficeAddr() {
		return officeAddr;
	}
	/**
	 * @param officeAddr the officeAddr to set
	 */
	public void setOfficeAddr(Address officeAddr) {
		this.officeAddr = officeAddr;
	}
	/**
	 * @return the resiAddr
	 */
	public Address getResiAddr() {
		return resiAddr;
	}
	/**
	 * @param resiAddr the resiAddr to set
	 */
	public void setResiAddr(Address resiAddr) {
		this.resiAddr = resiAddr;
	}


	
}

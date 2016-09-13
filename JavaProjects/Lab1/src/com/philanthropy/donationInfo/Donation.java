package com.philanthropy.donationInfo;

import java.util.Date;

import org.springframework.stereotype.Component;

/**
 * 
 * @author stu1
 *  Donation class keeps information of all donation data
 */

public class Donation {
  private int donationID;
  private int donorID;
  private int projectID;
  private double amount;
  private Date dateOfDonation;

/**
 * @return the productId
 */
public int getProjectId() {
	return projectID;
}
/**
 * @param donationID
 * @param projectID
 * @param amount
 */
public Donation(int donationID, int projectID, int donorID,  double amount, Date dateOfDonation) {
	super();
	this.donationID = donationID;
	this.projectID = projectID;
	this.amount = amount;
	this.donorID = donorID;
	this.dateOfDonation = dateOfDonation;
}
/**
 * @param productId the productId to set
 */
public void setProjectId(int productId) {
	this.projectID = productId;
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

public int getDonationID() {
	return donationID;
}
public void setDonationID(int donationID) {
	this.donationID = donationID;
}
public int getDonorID() {
	return donorID;
}
public void setDonorID(int donorID) {
	this.donorID = donorID;
}

public Date getDateOfDonation() {
	return dateOfDonation;
}
public void setDateOfDonation(Date dateOfDonation) {
	this.dateOfDonation = dateOfDonation;
}






}

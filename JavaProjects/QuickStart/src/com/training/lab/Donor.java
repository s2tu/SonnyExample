package com.training.lab;

import java.util.ArrayList;

/**
 * 
 * @author stu1
 * Keeps the data associated to a donor.
 */
public class Donor {
	private int donorID;
	private String name;
	private String email;
	private ArrayList<Donation> myDonations;

	/**
	 * 
	 * @param name of donor.
	 * @param email of donor.
	 */
	public Donor(String name, String email) {
		super();
		this.name = name;
		this.email = email;
		this.myDonations = new ArrayList<Donation>();
	}

	/**
	 * 
	 * @return the name of donor.
	 */
	public String getName() {
		return name;
	}
	/**
	 * 
	 * @param name sets the name of donor.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return email of donor.
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * 
	 * @param email set the email of donor.
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * 
	 * @param donorID set the identifier for donor.
	 */
	public void setdonorID(int donorID){
		this.donorID = donorID;
	}
	/**
	 * 
	 * @return an Arraylist of all the donation data for this donor.
	 */
	public  ArrayList<Donation> getDonations(){
		return myDonations;
	}

	/**
	 * makes a donation to a specific product.
	 * @param amount of donation.
	 * @param projectID donate to projectID .
	 * @param productID donate to Product ID.
	 * @param portal  using portal to make a donation.
	 */
	public void makeDontation(double amount, int projectID, int productID, WebPortal portal){
		Donation donate = new Donation(amount, this, projectID, productID);	
		this.myDonations.add(donate);
		portal.applyDonation(donate);
	}


	/**
	 * /make a donation to general project.
	 * @param amount of donation.
	 * @param projectID donate to projectID .
	 * @param portal  using portal to make a donation.
	 */
	public void makeDontation(double amount, int projectID, WebPortal portal){
		Donation donate = new Donation(amount, this, projectID, -1);
		this.myDonations.add(donate);
		portal.applyDonation(donate);
	}	


}

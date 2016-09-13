package com.philanthropy.donationInfo;

import java.util.ArrayList;
import java.util.Date;

import com.philanthropy.interfaces.Manager;

public class DonationManager implements Manager<Donation>{

	protected DonationsDao donationDoa;
	
	public DonationManager() {
		this.donationDoa = new DonationsDao();
	}

	@Override
	public int removeitem(int itemID) {
		int result = donationDoa.delete(itemID);
		if(result == 0){
			System.out.println("Error: Removing Donation");
		}
		
		return result;
	}

	@Override
	public String displayAll() {
		ArrayList<Donation> allDonations = donationDoa.findAll();
		String message = "";
		for(Donation d:allDonations){
			message = message + displayDontion(d);
		}
		// TODO Auto-generated method stub
		return message;
	}

	
	//display donation id / project id / amount / date
	@Override
	public String displayOne(int itemID) {
		Donation donate = donationDoa.find(itemID);
		String message = displayDontion(donate);
		return message;
	}
	
	public String displayDontion(Donation donate){
		String message = "";
		message = message + "Donation ID: " + donate.getDonationID() +"\n";
		message = message + "Project ID: " + donate.getProjectId() +"\n";
		message = message + "Amount: " + donate.getAmount() +"\n";
		message = message + "Date: " + donate.getDateOfDonation() +"\n";	
		return message;
	}

	@Override
	public int additem(Donation item) {
		int result = donationDoa.add(item);
		if(result == 0){
			System.out.println("Error: Making Donation");
		}
		
		return result;
	}

}

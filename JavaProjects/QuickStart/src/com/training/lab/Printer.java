package com.training.lab;

public class Printer {
	/**
	 * 
	 * @param title prints a title in the format ------ title ---------
	 */
	public void  printTitle(String title){
		System.out.println("--------- "+  title +"------------");
	}
	/**
	 * 
	 * @param proj prints the project in the format -------- project name --------
	 */
	public void  printProjectName(Project proj){
		System.out.println("------Project: "+  proj.getProjectName() +"------");
	}	
	/**
	 * 
	 * @param prod  prints the product in the format -------- product name --------
	 */
	public void  printProductName(Product prod){
		System.out.println("----Product: "+  prod.getProductName() +"----");
	}
	/**
	 * 
	 * @param donor prints donor information
	 */
	public void printDonorDetails(Donation donor){
		System.out.println("Donor Name: " +  donor.getDonorName());
		System.out.println("Email: " +  donor.getDonorEmail());
		System.out.println("Amount: " + donor.getAmount());			
	}
	/**
	 * 
	 * @param donation takes the donation and prints the ID
	 */
	public void printDonation(Donation donation){
		System.out.println("------Donation ID: "+  donation.getDonationID() +"------");
	}
	/**
	 * 
	 * @param prod takes a product and display all details 
	 */
	public void printProductDetails(Product prod){
		double pendingCost = prod.getProductCost();
		double donationsMade = prod.getamountDonated();
		System.out.println("Product ID:" + prod.getProductID());
		System.out.println("Description:" + prod.getDescription());
		System.out.println("Pending Costs for project: " + pendingCost);
		System.out.println("Collected Donations: " + donationsMade);
		System.out.println("Original Product Cost: " +  (pendingCost + donationsMade));
		System.out.println("");
	}
	/**
	 * 
	 * @param proj akes a project and display all details 
	 */
	public void printProjectDetails(Project proj){
		double pendingCost = proj.getProjectCost();
		double donationsMade = proj.getDonationsMade();
		System.out.println("Project ID:" + proj.getProjectID());
		System.out.println("Description:" + proj.getDescription());
		System.out.println("Pending Costs for project: " + pendingCost);
		System.out.println("Collected Donations: " + donationsMade);
		System.out.println("Original Project Cost: " +  (pendingCost + donationsMade));
		System.out.println("");
	}

}

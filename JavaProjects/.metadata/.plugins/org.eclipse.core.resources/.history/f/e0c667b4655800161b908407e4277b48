package com.training.lab;
/**
 * 
 * @author stu1
 *  Donation class keeps information of all donation data
 */
public class Donation {
  private int donationID;
  private int productId;
  private int projectId;
  private double amount;
  private Donor person;

  /**
   * 
   * @param amount of donation
   * @param person This is the contact information
   * @param projectId  Project ID associated to the donation
   * @param productId  Product ID associated to the donation
   */
  public Donation(double amount, Donor person, int projectId, int productId){
    this.amount = amount;
    this.person = person;
    this.productId = productId;
    this.projectId = projectId;
  }
  /**
   * 
   * @return productID get associated to donation
   */
  public int getProductId() {
    return productId;
  }

  /**
   * 
   * @param productId set associated to donation
   */
  public void setProductId(int productId) {
    this.productId = productId;
  }
  /**
   * 
   * @return get Project ID associated to donation
   */
  public int getProjectId() {
    return projectId;
  }
  /**
   * 
   * @param projectId set Project ID for donation
   */
  public void setProjectId(int projectId) {
    this.projectId = projectId;
  }
  /**
   * 
   * @return return the amount for donation
   */
  public double getAmount() {
    return amount;
  }
  /**
   * 
   * @param amount set amount for donation
   */
  public void setAmount(double amount) {
    this.amount = amount;
  }
  /**
   * 
   * @return obtain a string to represent donor's name
   */
  public String getDonorName() {
    return person.getName();
  }
  /**
   * 
   * @return an identifier for each donation
   */
  public int getDonationID() {
    return this.donationID;
  }	
  /**
   * 
   * @param donationid set the donation ID
   */
  public void setDonationID(int donationid) {
    this.donationID = donationid;
  }		

  /**
   * 
   * @return obtain the donor's email
   */
  public String getDonorEmail() {
    return person.getEmail();
  }

  /**
   * 
   * @param person set the donor's details to the  donation object
   */
  public void setPerson(Donor person) {
    this.person = person;
  }



}

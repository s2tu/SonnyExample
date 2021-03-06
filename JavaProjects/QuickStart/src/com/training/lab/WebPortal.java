package com.training.lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class WebPortal {
  private String name;
  private String description;
  private Printer printer;
  //maintains the projectIDs
  private HashMap<Integer, Project> projectDatabase;
  //key projectID, productID and the arraylist is the list of donations
  private HashMap<List<Integer>, ArrayList<Donation>> donationDatabase;
  /**
   * 
   * @param name name of the portal
   * @param description of the portal
   */
  public WebPortal(String name, String description){
    super();
    this.name = name;
    this.description = description;
    this.projectDatabase = new HashMap<Integer, Project>();
    this.donationDatabase = new HashMap<List<Integer>, ArrayList<Donation>>();
    this.printer =  new Printer();
  }
  /** 
   * 
   * @return returns the description of the portal
   */
  public String getDescription(){
    return this.description;
  }
  /**
   * 
   * @param proj adds a project to the portal and manages project IDS
   */
  public void addProject(Project proj){
    int projectID = this.projectDatabase.size();
    proj.setProjectID(projectID);
    this.projectDatabase.put(projectID, proj);	
  }


  /**
   * functions for product specific action gives money and updates cost info of the project
   * @param donation
   */
  public void applyDonation(Donation donation) {
    //this means that this is a no Product donation
    Project project = projectDatabase.get(donation.getProjectId());

    try {
      project.addDonations(donation);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    int numDonations = donationDatabase.size();
    donation.setDonationID(numDonations);
    if(donationDatabase.containsKey((Arrays.asList(donation.getProjectId(), donation.getProductId())))){
      donationDatabase.get(Arrays.asList(donation.getProjectId(), donation.getProductId())).add(donation);
    }else{
      ArrayList<Donation> donationList = new ArrayList<Donation>();
      donationList.add(donation);
      donationDatabase.put(Arrays.asList(donation.getProjectId(), donation.getProductId()), donationList);
    }	
  }
  /**
   *  prints all project details 
   */
  public void printProjectsProducts(){
    for(Project proj : this.projectDatabase.values()){
      this.printDetails(proj.getProjectID());
      for(Product prod : proj.getProductDatabase().values()){
        this.printDetails(proj.getProjectID(), prod.getProductID());
      }
    }
  }

  /**
   * gets the project details for the product
   * @param projectID the project ID
   * @param productID the product ID
   */
  public void printDetails(int projectID, int productID){
    Project project = projectDatabase.get(projectID);
    Product product = project.getProduct(productID);
    //double pendingCost = product.getProductCost();
    this.printer.printTitle("Printing Product Details for " + product.getProductName());
    this.printer.printProductDetails(product);
  }

  /**
   * Gets the details for the project
   * @param projectID the projectID
   */
  public void printDetails(int projectID){
    Project project = projectDatabase.get(projectID);
    this.printer.printTitle("Printing Project Details for "+ project.getProjectName());
    ///double pendingCost = project.getProjectCost();
    this.printer.printProjectDetails(project);
  }	


  /**
   *print project and product donations
   *prints project name
   *prints products 
   *prints donators for project and product
   */
  public void  printAllProjectProductDonations(){
    if( this.donationDatabase.size() == 0){
      System.out.println("There are currently no donations.");
      return;
    }
    this.printer.printTitle("Printing All Donations Details");
    for (List<Integer> projectproductID : this.donationDatabase.keySet()){
      //print the project
      this.printer.printProjectName(this.projectDatabase.get(projectproductID.get(0)));;
      if(projectproductID.get(1) == -1){				
        ArrayList<Donation> donateList  = this.donationDatabase.get(projectproductID);
        for(Donation donate : donateList){
          this.printer.printDonorDetails(donate);
          //System.out.println("Donor Name: " +  donate.getDonorName());
          //System.out.println("Email: " +  donate.getDonorEmail());
          //System.out.println("Amount: " + donate.getAmount());
        }	
      }else{
        this.printer.printProductName(this.projectDatabase.get(projectproductID.get(0)).getProduct(projectproductID.get(1)));
        ArrayList<Donation> donateList  = this.donationDatabase.get(projectproductID);
        for(Donation donate : donateList){
          this.printer.printDonorDetails(donate);
        }					

      }
      System.out.println("");
    }		
  }


  /**
   * print specific project donation data
   * @param projectID of the project
   */
  void printprojectDonations(int projectID){		
    for (List<Integer> projectproductID: donationDatabase.keySet()){
      if(projectproductID.get(0) == projectID ){
        ArrayList<Donation> donateList  = this.donationDatabase.get(Arrays.asList(projectproductID.get(0),projectproductID.get(1)));
        for(Donation donate : donateList){
          this.printer.printDonation(donate);
          this.printer.printDonorDetails(donate);
        }

      }
    }
  }


  /**
   * print specific product donations
   * @param productID of a project
   */
  public void printproductDonations(int productID){		
    for (List<Integer> projectproductID: donationDatabase.keySet()){
      if(projectproductID.get(1) == productID){
        ArrayList<Donation> donateList  = this.donationDatabase.get(Arrays.asList(projectproductID.get(0),projectproductID.get(1)));
        for(Donation donate : donateList){
          this.printer.printDonation(donate);
          this.printer.printDonorDetails(donate);
        }

      }
    }
  }

  /**
   * print donation information for the donor
   * @param person
   */
  public void printDonationPerson(Donor person){
    this.printer.printTitle("Printing Donation Data for Portal Users");
    for (Donation donate:person.getDonations()){		
      this.printer.printDonation(donate);
      this.printer.printProjectName(this.projectDatabase.get(donate.getProjectId()));
      if(donate.getProductId() != -1){
        this.printer.printProductName( this.projectDatabase.get(donate.getProductId()).getProduct(donate.getProductId()));
      }			
      this.printer.printDonorDetails(donate);
      System.out.println("");

    }		
  }

  public String getName(){
    return this.name;
  }

}

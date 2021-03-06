package com.training.lab;

import java.util.HashMap;

public class Project {
  private String projectName;
  private int projectID;
  private String descriptionOfProject;
  //productID and Database
  private HashMap<Integer,Product> productDatabase;
  private double projectCost;
  private double amountDonated;

  /**
   * 
   * @param projectName Name of project
   * @param descriptionOfProject description of project.
   * @param initalProjectCost  Initial Project costs.
   */
  public Project(String projectName, String descriptionOfProject, int initalProjectCost) {
    super();
    this.projectName = projectName;
    this.descriptionOfProject = descriptionOfProject;
    this.productDatabase = new HashMap<Integer,Product>();
    this.projectCost = initalProjectCost;
  }
  /**
   * 
   * @param unit adds a product under the project
   */
  public void addProduct(Product unit){
    //adds the product to the hash map
    //updates the productID
    //updates the cost of the project
    //updates the productID 
    int productID = this.productDatabase.size();
    unit.setProductID(productID);
    projectCost = projectCost + unit.getProductCost();
    this.productDatabase.put(productID, unit);		  
  }
  /**
   * 
   * @return the product database
   */
  public HashMap<Integer,Product> getProductDatabase(){
    return productDatabase;
  }

  /**
   * 
   * @return the project identifier
   */
  public int getProjectID(){
    return this.projectID;
  }
  /**
   * 
   * @param projectID sets the project identifier
   */
  public void setProjectID(int projectID){
    this.projectID = projectID;
  }
  /**
   * 
   * @param productID associated to the product
   * @return returns a product based on the product ID
   */
  public Product getProduct(int productID){
    return this.productDatabase.get(productID);
  }
  /**
   * 
   * @return the project NAme
   */
  public String getProjectName(){
    return this.projectName;
  }
  /**
   * 
   * @return cost of the project
   */
  public double getProjectCost(){
    return this.projectCost;
  }
  /**
   * 
   * @return the description of the project
   */
  public String getDescription(){
    return this.descriptionOfProject;
  }
  /**
   * 
   * @return the total amount of donated amount
   */
  public double getDonationsMade(){
    return this.amountDonated;
  }
  /**
   * 
   * @param donate the donation details 
   * @throws ImproperDonationException throws this if the donation exceeds the pending costs
   */
  public void addDonations(Donation donate) throws ImproperDonationException{
    if(this.projectCost - donate.getAmount() < 0){
      this.amountDonated = this.amountDonated + this.projectCost;
      this.projectCost = 0;
      throw new ImproperDonationException();
    }
    this.projectCost = this.projectCost  - donate.getAmount();
    this.amountDonated = this.amountDonated  + donate.getAmount();

    if(donate.getProductId() != -1){
      Product product = this.productDatabase.get(donate.getProductId());
      product.applyProductDonation(donate.getAmount());
    }else{
      //distribute the donation amount equally 
      int amountProducts = this.productDatabase.size();
      double distributeAmount = donate.getAmount()/amountProducts;
      for(Product product: this.productDatabase.values()){
        product.applyProductDonation(distributeAmount);
      }
    }
  }

  //update cost for amount 





}
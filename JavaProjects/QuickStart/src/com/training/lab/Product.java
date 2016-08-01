package com.training.lab;

public class Product {
  //this is assigned at projectlevel
  private int productID;
  //name of product
  private String name;
  //description of product
  private String description;
  //cost of the product
  private double productCost;
  //images of the product
  private String[] images;
  private double amountDonated;


  /**
   *  Constructor with the images
   * @param name of product
   * @param description of product
   * @param productCost cost of product
   * @param images
   */
  public Product( String name, String description, double productCost, String[] images) {
    super();
    this.name = name;
    this.description = description;
    this.productCost = productCost;
    this.images = images;
  }
  /**
   *  Overloading Constructor without the images
   * @param name of product
   * @param description of product
   * @param productCost cost of product
   * @param images
   */
  public Product( String name, String description, double productCost) {
    super();
    this.name = name;
    this.description = description;
    this.productCost = productCost;
  }	
  /**
   * 
   * @return the description of the product
   */
  public String getDescription(){
    return this.description;
  }
  /**
   * 
   * @return the product name 
   */
  public String getProductName(){
    return name;
  }
  /**
   * 
   * @return the amount donated to this particular product
   */
  public double getamountDonated(){
    return this.amountDonated;
  }
  public int getProductID(){
    return this.productID;
  }	
  /**
   * 
   * @param productID the identifier for this product
   */
  public void setProductID(int productID){
    this.productID = productID;
  }
  /**
   * 
   * @return the product 
   */
  public double getProductCost(){
    return this.productCost;
  }
  /**
   * 
   * @param amount the amount of donation
   * @throws ImproperDonationException throws this exception if the donation is over
   */
  void applyProductDonation(double amount) throws ImproperDonationException{
    //check if below 0
    if((this.productCost - amount  < 0) ){
      this.amountDonated = this.amountDonated + this.productCost;
      this.productCost = 0;
      throw new ImproperDonationException();
    }
    this.productCost = this.productCost - amount;
    this.amountDonated = this.amountDonated + amount;
  }

}

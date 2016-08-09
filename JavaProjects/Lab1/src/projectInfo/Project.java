package projectInfo;

import java.util.ArrayList;
import java.util.HashMap;

import donorInfo.Donation;

public class Project {
	private String projectName;
	private int projectID;
	private String descriptionOfProject;
	private double projectCost;
	private double amountDonated;
	///private double pendingCost;

	/**
	 * @param projectName
	 * @param projectID
	 * @param descriptionOfProject
	 * @param projectCost
	 */
	public Project(String projectName, int projectID, String descriptionOfProject, double projectCost) {
		super();
		this.projectName = projectName;
		this.projectID = projectID;
		this.descriptionOfProject = descriptionOfProject;
		this.projectCost = projectCost;
	
		
	}
	/**
	 * @return the projectName
	 */
	public String getProjectName() {
		return projectName;
	}
	/**
	 * @param projectName the projectName to set
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	/**
	 * @return the projectID
	 */
	public int getProjectID() {
		return projectID;
	}
	/**
	 * @param projectID the projectID to set
	 */
	public void setProjectID(int projectID) {
		this.projectID = projectID;
	}
	/**
	 * @return the descriptionOfProject
	 */
	public String getDescriptionOfProject() {
		return descriptionOfProject;
	}
	/**
	 * @param descriptionOfProject the descriptionOfProject to set
	 */
	public void setDescriptionOfProject(String descriptionOfProject) {
		this.descriptionOfProject = descriptionOfProject;
	}
	/**
	 * @return the projectCost
	 */
	public double getProjectCost() {
		return projectCost;
	}
	/**
	 * @param projectCost the projectCost to set
	 */
	public void setProjectCost(double projectCost) {
		this.projectCost = projectCost;
	}
	/**
	 * @return the amountDonated
	 */
	public double getAmountDonated() {
		return amountDonated;
	}
	/**
	 * @param amountDonated the amountDonated to set
	 */
	public void setAmountDonated(double amountDonated) {
		this.amountDonated = amountDonated;
	}


	@Override
	public boolean equals(Object obj){
		Project itemProject = (Project)obj;
		return (this.projectName == itemProject.projectName && this.projectID == itemProject.projectID && this.descriptionOfProject == itemProject.descriptionOfProject && this.projectCost == itemProject.projectCost);
		
	}


	/**
	 * 
	 * @param donate the donation details 
	 * @throws ImproperDonationException throws this if the donation exceeds the pending costs
	 */
	/*
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
	 */
	//update cost for amount 





}
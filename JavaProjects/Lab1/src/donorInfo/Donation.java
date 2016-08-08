package donorInfo;
/**
 * 
 * @author stu1
 *  Donation class keeps information of all donation data
 */
public class Donation {
  private int donationID;
  private int projectID;
  private double amount;

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
public Donation(int projectID, double amount) {
	super();
	this.projectID = projectID;
	this.amount = amount;
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






}

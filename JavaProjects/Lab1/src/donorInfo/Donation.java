package donorInfo;
/**
 * 
 * @author stu1
 *  Donation class keeps information of all donation data
 */
public class Donation {
  private int projectID;
  private double amount;
  private Donor person;

/**
 * @param projectID
 * @param amount
 * @param person
 */
public Donation(int projectID, double amount, Donor person) {
	super();
	this.projectID = projectID;
	this.amount = amount;
	this.person = person;
}
/**
 * @return the productId
 */
public int getProjectId() {
	return projectID;
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
/**
 * @return the person
 */
public Donor getPerson() {
	return person;
}
/**
 * @param person the person to set
 */
public void setPerson(Donor person) {
	this.person = person;
}






}

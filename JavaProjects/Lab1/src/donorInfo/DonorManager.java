/**
 * 
 */
package donorInfo;

import java.util.ArrayList;
import java.util.HashMap;

import interfaces.Manager;
import projectInfo.ProjectManager;

/**The donor manager is responsible for managing Donations and Donor details
 * @author stu1
 *
 */
public class DonorManager implements Manager{
	String message;
	//the donor manager needs to have details about the donation to explain the project detials 
	ProjectManager projManager;
	//donorID, donations
	HashMap<Integer, ArrayList<Donation>> donationDatabase;
	HashMap<Integer, Donor> donorsDatabase;
	//ArrayList<Donor> donors;
	
	public DonorManager(ProjectManager manager){
		this.projManager = manager;
		this.donationDatabase = new HashMap<Integer, ArrayList<Donation>>();
		this.donorsDatabase = new HashMap<Integer, Donor>() ;
	}
	
	@Override
	public void additem(Object item) {
		// TODO Auto-generated method stub		
		Donor newDonor = (Donor)item;
		if(!donorsDatabase.containsKey(newDonor.getDonorID())){
			donorsDatabase.put(newDonor.getDonorID(), newDonor);
		}			
	}

	@Override
	public void removeitem(Object item) {
		Donor aDonor = (Donor)item;
		if(donorsDatabase.containsKey(aDonor.getDonorID())){
			donorsDatabase.remove(aDonor.getDonorID());
		}	
		if(donationDatabase.containsKey(aDonor.getDonorID())){
			donationDatabase.remove(aDonor.getDonorID());
		}	
	}

	/**
	 * Display Donations for everyone 
	 */
	@Override
	public String displayAll() {
		return message;
		// TODO Auto-generated method stub
		
	}

	/**
	 * Displays donations for the particular person	
	 * itemID is the peron's name
	 */
	@Override
	public String displayOne(int donorID) {
		ArrayList<Donation> donorDonations =  donationDatabase.get(donorID);
		Donor donor = donorsDatabase.get(donorID);
		String output = "";
		//Donor Name
		//Donor  Email
		output = output +  "Donor Name:" +  donor.getName()  + "\n";
		output = output +  "Email: " +  donor.getEmail()   + "\n";
		output = output +  "Phone Number: " + donor.getHandPhone()  + "\n";
		for(Donation d: donorDonations){
			output = output + "Donation ID: " +  d.getDonationID();
			output = output + "Amount: " +  d.getAmount();
			output = output + projManager.displayProjectSimpleInfo(d.getProjectId());
		}
		
		return output;
		// TODO Auto-generated method stub	
	}
	
	/**
	 * 
	 * @param person
	 * @param projectID
	 * @param amount
	 */
	public void makeDonation(Donor person, int projectID, double amount){
		Donation donation = new Donation(projectID, amount, person);
		if(donationDatabase.containsKey(person.getDonorID())){
			ArrayList<Donation> newArrayList = new ArrayList<Donation>();
			newArrayList.add(donation);
			donationDatabase.put(person.getDonorID(), newArrayList);
		}else{
			ArrayList<Donation> donorDonations = donationDatabase.get(person.getDonorID());
			donorDonations.add(donation);
		}		
		projManager.updateProjectCosts(donation);
	}

}

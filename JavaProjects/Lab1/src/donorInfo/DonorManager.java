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
public class DonorManager implements Manager<Donor>{
	String message;
	//the donor manager needs to have details about the donation to explain the project detials 
	ProjectManager projManager;
	//donorID, donations
	HashMap<Integer, ArrayList<Donation>> donationDatabase;
	HashMap<Integer, Donor> donorsDatabase;
	
	DonorDao donorDao;
	
	//ArrayList<Donor> donors;
	
	public DonorManager(ProjectManager manager){
		this.projManager = manager;
		this.donationDatabase = new HashMap<Integer, ArrayList<Donation>>();
		this.donorsDatabase = new HashMap<Integer, Donor>() ;
		this.donorDao = new DonorDao();
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
	 * 
	 * @param person
	 * @param projectID
	 * @param amount
	 */
	public void makeDonation(Donor person, int projectID, double amount){
		Donation donation = new Donation(projectID, amount);
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


	@Override
	public int removeitem(int itemID) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String displayOne(int itemID) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public int additem(Donor item) {
		// TODO Auto-generated method stub
		return 0;
	}

}

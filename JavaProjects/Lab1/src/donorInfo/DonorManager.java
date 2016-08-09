/**
 * 
 */
package donorInfo;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import donationInfo.Donation;
import donationInfo.DonationsDao;
import interfaces.Manager;
import projectInfo.Project;
import projectInfo.ProjectDao;
import projectInfo.ProjectManager;

/**The donor manager is responsible for managing Donations and Donor details
 * @author stu1
 *
 */
public class DonorManager implements Manager<Donor>{

	
	protected DonorDao donorDao;
	protected DonationsDao donationDoa;

	
	public DonorManager(){
		this.donorDao = new DonorDao();
		this.donationDoa = new DonationsDao();
	}
	

	/**
	 * Display all registered users and their donations if any?yeah...
	 */
	@Override
	public String displayAll() {
		ArrayList<Donor> donorList =  donorDao.findAll();
		String message="";
		for(Donor d:donorList){
			message  = message + displayDonorInfo(d)  +  displayDonorDonationInfo(d.getDonorID()) + "\n";
		}
		return message;
	}
	
	
	
	
	//makeDonation 
	//takes in donorID
	//projectID 
	//amount
	//then uses the donationsDAO to do the 
	public int makeDonation(int donationID, int donorID, int projectID, double amount){
		int result = donationDoa.add(new Donation(donationID, projectID, donorID, amount, new Date()));
		if(result == 0){
			System.out.println("Error: Making Donation");
		}
		
		return result;
	}

	@Override
	public int removeitem(int donorID) {
		
		int result = donorDao.delete(donorID);
		if(result == 0){
			System.out.println("Error: removing donor from database");
		}
		//should I remove 
		// TODO Auto-generated method stub
		return result;
	}

	/**
	 * display one information of user and all donation info
	 */
	@Override
	public String displayOne(int donorID) {
		Donor donor = donorDao.find(donorID);
		String message = displayDonorInfo(donor) + displayDonorDonationInfo(donorID);
		//need to add the donation info
		// TODO Auto-generated method stub
		return message;
	}

	public String displayDonorInfo(Donor donor){
		String message=  "";
		//display name email and donor id
		message = "Donor ID: "  + donor.getDonorID() + "\n";
		message = message + "Name: "  + donor.getName() + "\n";
		message = message + "Email: "  + donor.getEmail() + "\n";
		return message;
	}

	
	//The problem with this is that I have a project ID where I want to translate the name
	//just give it a DAO? 
	public String displayDonorDonationInfo(int donorID){
		String message ="";
		ArrayList<Map<String, Object>> dataResult = donorDao.getDonationsForDonor(donorID);
		for(Map<String, Object> data:dataResult){		
			message = message  + "\t Donation ID: " + data.get("DONATION_ID")  + "\n";
			message = message  + "\t Project Name: " + data.get("PROJECT_NAME")   + "\n";
			message = message  + "\t Amount: " + data.get("DONATION_AMOUNT") + "\n";
			message = message  + "\t Date: " +  data.get("DONATION_DATE")   + "\n";		
		}
		return message;
	}
	
	@Override
	public int additem(Donor item) {
		int result = donorDao.add(item);
		if(result == 0){
			System.out.println("Error: adding donor from database.");
		}
		//should I remove 
		// TODO Auto-generated method stub
		return result;
	}
	
	//authenticate check donor's email with database

}

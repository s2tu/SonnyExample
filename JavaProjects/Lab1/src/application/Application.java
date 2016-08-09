package application;

import java.util.Date;

import donationInfo.Donation;
import donationInfo.DonationManager;
import donorInfo.Donor;
import donorInfo.DonorManager;
import projectInfo.Project;
import projectInfo.ProjectManager;

public class Application {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
	  
	  //create a projectManager
	  //add a project 
	  //display its details
	  ProjectManager projManager = new ProjectManager();
	 // projManager.additem(new Project("Test2", 7, "This is my first project", 5000));

	  
	  DonorManager donorManager = new DonorManager();
	  DonationManager donaitonManager = new DonationManager();
//	   donorManager.additem(new Donor(1, "Sonny2", "test@hotmail.com"));
//  	   donorManager.makeDonation(1, 1, 7, 50);
	  

	  System.out.println(donaitonManager.displayAll());
	//  System.out.println(projManager.displayAll());
	 // System.out.println(donorManager.displayAll());
  }

}

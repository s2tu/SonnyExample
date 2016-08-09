package application;

import donorInfo.Donation;
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
	  //projManager.additem(new Project("Test", 6, "This is my first project", 5000));

	  
	  DonorManager donorManager = new DonorManager();
	  //donorManager.displayDonorDonationInfo(1);
	  //donorManager.additem(new Donor(2, "Sonny2", "test@hotmail.com"));
//	  donorManager.makeDonation(4, 2, 6, 50);
	  

	  System.out.println(projManager.displayOne(1));
	  //System.out.println(donorManager.displayAll());
  }

}

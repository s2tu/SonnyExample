package com.application;

import java.util.Date;

import com.philanthropy.donationInfo.Donation;
import com.philanthropy.donationInfo.DonationManager;
import com.philanthropy.donorInfo.Donor;
import com.philanthropy.donorInfo.DonorManager;
import com.philanthropy.projectInfo.Project;
import com.philanthropy.projectInfo.ProjectManager;

public class Application {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
	  
	  //create a projectManager
	  //add a project 
	  //display its details
	  ProjectManager projManager = new ProjectManager();
	  //projManager.additem(new Project("Client Care", 1, "This is my first project", 5000));
	 // projManager.additem(new Project("Education", 2, "This is my second project", 4000));
	  
	  
	  //Removing Items
	  //projManager.removeitem(1);
	  //projManager.removeitem(2);
	  
	  
	  DonorManager donorManager = new DonorManager();
	 

	  DonationManager donationManager = new DonationManager();
	   
	  //donorManager.additem(new Donor(1, "Sonny2", "test@hotmail.com"));
	 //donorManager.removeitem(1);
	  
	  
	  //donationManager.additem(new Donation(1, 1, 1, 50, new Date()));
	  //donationManager.removeitem(1);
	  


	  System.out.println(projManager.displayAll());
	  System.out.println(donorManager.displayAll());
  }

}

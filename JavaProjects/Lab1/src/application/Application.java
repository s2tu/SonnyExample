package application;

import donorInfo.Donation;
import projectInfo.Project;
import projectInfo.ProjectManager;

public class Application {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
	  
	  //create a projectManager
	  //add a project 
	  //display its details
	  ProjectManager projManager = new ProjectManager();
	 // projManager.additem(new Project("Test", 6, "This is my first project", 5000));
	 
	 // System.out.println(projManager.displayOne(101));
	 // projManager.removeitem(6);
	  
	  Donation donation = new Donation(1, 40);
	  projManager.updateProjectCosts(donation);
	  System.out.println(projManager.displayAll());
  }

}

package projectInfo;

import java.util.ArrayList;
import java.util.HashMap;

import donorInfo.Donation;
import interfaces.Manager;
/**
 *  The project Manager is responsible for managing and maintain projects
 * @author stu1
 *
 */
public class ProjectManager implements Manager {


	private HashMap<Integer, Project>  projectDatabase;
	
	//This is the messager of the projectManager
	private String message;
	public ProjectManager() {
		this.projectDatabase = new HashMap<Integer, Project>();
	}
	
	/**
	 * Adds a project based on projectID
	 */
	@Override
	public void additem(Object item) {
		// TODO Auto-generated method stub
		Project aProject = (Project)item;
		if(!projectDatabase.containsKey(aProject.getProjectID())){
			projectDatabase.put(aProject.getProjectID(), aProject);
		}
	}

	/**
	 * Removes a project based on ProjectID
	 */
	@Override
	public void removeitem(Object item) {
		Project aProject = (Project)item;
		if(!projectDatabase.containsKey(aProject.getProjectID())){
			projectDatabase.remove(aProject.getProjectID());
		}			
	}

	/**
	 * Display all projects and cost details
	 */
	@Override
	public String displayAll() {
		// TODO Auto-generated method stub
		return message;
	}

	/**
	 * Display one project ID costdetails
	 */
	@Override
	public String displayOne(int itemID) {
		String output = displayProjectSimpleInfo(itemID);
		Project selectedProj = projectDatabase.get(itemID);
		output =  output + "Amount Donated: " +  selectedProj.getAmountDonated() + "\n";
		output =  output + "Pending Costs: " + getPendingCost(itemID) + "\n";
		output =  output + "Description: " +  selectedProj.getDescriptionOfProject() + "\n";		
		return output;

	}
	
	public String displayProjectSimpleInfo(int projectID){
		String output = "";
		Project selectedProj = projectDatabase.get(projectID);
		output =  output + "Project ID: "  + selectedProj.getProjectID() + "\n";
		output =  output + "Name:"  + selectedProj.getProjectName() + "\n";
		output =  output + "Description: " + selectedProj.getDescriptionOfProject() + "\n";
		return output;
		
	}


	
	public double getPendingCost(int projID){
		Project selectedProject =projectDatabase.get(projID);
		return (selectedProject.getProjectCost() +  selectedProject.getAmountDonated());
	}
	//Add donations to project
	public void updateProjectCosts(Donation donation){
		Project selectedProject = projectDatabase.get(donation.getProjectId());
		double  donatedAmount= selectedProject.getAmountDonated();
		double pendingAmount =  selectedProject.getProjectCost() - donatedAmount;
		donatedAmount = donation.getAmount() + donatedAmount;
		pendingAmount = pendingAmount - donation.getAmount();
		selectedProject.setAmountDonated(donatedAmount);	
	}
	

}

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
		// TODO Auto-generated method stub
		return message;
	}
	
	
	//Add donations to project
	public void updateProjectCosts(Donation donation){
		Project selectedProject = projectDatabase.get(donation.getProjectId());
		double  donatedAmount= selectedProject.getAmountDonated();
		double pendingAmount = selectedProject.getPendingCost();
		donatedAmount = donation.getAmount() + donatedAmount;
		pendingAmount = pendingAmount - donation.getAmount();
		selectedProject.setAmountDonated(donatedAmount);
		selectedProject.setPendingCost(pendingAmount);		
	}
	

}
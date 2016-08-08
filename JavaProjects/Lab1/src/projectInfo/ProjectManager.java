package projectInfo;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import donorInfo.Donation;
import donorInfo.DonorDao;
import interfaces.Manager;
/**
 *  The project Manager is responsible for managing and maintain projects
 * @author stu1
 *
 */
public class ProjectManager implements Manager<Project> {


	private HashMap<Integer, Project>  projectDatabase;
	protected ProjectDao projectDao;
	
	//This is the messager of the projectManager
	private String message;
	public ProjectManager() {
		this.projectDatabase = new HashMap<Integer, Project>();
		this.projectDao = new ProjectDao();
	}
	
	/**
	 * Adds a project based on projectID
	 */
	@Override
	public int additem(Project item) {
		Project aProject = (Project)item;
		int result = projectDao.add(aProject);	
		//make this a add exception
		if(result == 0){
			System.out.println("Error: adding project to database");
		}
		return result;
	}	

	/**
	 * Removes a project based on ProjectID
	 */
	@Override
	public int removeitem(int projectID) {
		int result = projectDao.delete(projectID);
		//make this a add exception
		if(result == 0){
			System.out.println("Error: Removing project to database");
		}
		return result;
		
	}

	/**
	 * Display all projects and cost details
	 */
	@Override
	public String displayAll() {
		String output = "";
		ArrayList<Project> projectTable = projectDao.findAll();
		for(Project proj:projectTable){
			output =  output + displayProjectSimpleInfo(proj);
			output =  output + displayProjectCostInfo(proj);
			output = output + "\n";
		}
		// TODO Auto-generated method stub
		return output;
	}

	/**
	 * Display one project ID this method is only used by projectManager 
	 */
	@Override
	public String displayOne(int projID) {
		Project aProject =  projectDao.find(projID);
		String output = "";
		output =  output + displayProjectSimpleInfo(aProject);
		output =  output + displayProjectCostInfo(aProject);
		return output;

	}
	
	/**
	 * This method is used by the DonorManager in order to display simple information
	 * @param proj
	 * @return
	 */
	public String displayProjectSimpleInfo(Project proj){
		String output = "";
		output =  output + "Project ID: "  + proj.getProjectID() + "\n";
		output =  output + "Name:"  + proj.getProjectName() + "\n";
		output =  output + "Description: " + proj.getDescriptionOfProject() + "\n";
		return output;
		
	}
	
	public String displayProjectCostInfo(Project proj){
		String output = "";
		output =  output + "Amount Donated: " +  proj.getAmountDonated() + "\n";
		output =  output + "Pending Costs: " + getPendingCost(proj) + "\n";			
		return output;
		
	}	
	
	//if the pending cost is -negative then we got a problem
	//raise exception saying that project pending cost have been met
	public double getPendingCost(Project proj){

		return (proj.getProjectCost() -  proj.getAmountDonated());
	}
	//Add the donation to the project
	public int updateProjectCosts(Donation donation){
		int result =  projectDao.update(donation.getProjectId(), donation.getAmount());
		if (result == 0){
			System.out.println("Error: Updating donation for project.");
		}
		return result;
		 
	}


	

}

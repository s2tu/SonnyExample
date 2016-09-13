package com.philanthropy.projectInfo;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.philanthropy.donationInfo.Donation;
import com.philanthropy.donorInfo.DonorDao;
import com.philanthropy.interfaces.Manager;
/**
 *  The project Manager is responsible for managing and maintain projects
 * @author stu1
 *
 */
public class ProjectManager implements Manager<Project> {



	protected ProjectDao projectDao;
	
	//This is the messager of the projectManager
	public ProjectManager() {
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
			output =  output + displayProjectDonations(proj.getProjectID());
			//displayDonations info
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
		try{
			Project aProject =  projectDao.find(projID);		
			String output = "";
			output =  output + displayProjectSimpleInfo(aProject);
			output =  output + displayProjectCostInfo(aProject);
			output =  output + displayProjectDonations(aProject.getProjectID());
			//display donations info
			return output;
		}catch(NullPointerException e){
			//there should be logging here
			System.out.println(e.getMessage());
			return null;
		}
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
	//take a projID 
	//display donation content for ProjectID
	public String displayProjectDonations(int projID){
		String message = "";
		ArrayList<Map<String, Object>> dataResult = projectDao.getDonationsForProject(projID);
		if(dataResult.size() !=0){
			 message = "\t PROJECT DONATIONS ---------\n";
		}
		for(Map<String, Object> data:dataResult){		
			message = message  + "\t Donation ID: " + data.get("DONATION_ID")  + "\n";
			message = message  + "\t Donation Amount: " + data.get("DONATION_AMOUNT")  + "\n";
			message = message  + "\t Name: " + data.get("DONOR_NAME")  + "\n";
			message = message  + "\t Email: " + data.get("DONOR_EMAIL")  + "\n";
			message = message  + "\t Date: " + data.get("DONATION_DATE")  + "\n\n";		
		}
		return message;
	}
	
	
	
	
	//if the pending cost is -negative then we got a problem
	//raise exception saying that project pending cost have been met
	public double getPendingCost(Project proj){

		return (proj.getProjectCost() -  proj.getAmountDonated());
	}
	



	

}

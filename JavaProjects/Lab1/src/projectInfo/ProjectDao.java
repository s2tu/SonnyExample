package projectInfo;

import java.io.File;
import java.io.FileInputStream;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;



import daoUtils.DAO;
import daoUtils.MySQLConnection;

public class ProjectDao implements DAO<Project>{
	protected Connection con;
	protected String tableName;
	
	
	public ProjectDao() {
		this.tableName = "PROJECTS";
		this.con = MySQLConnection.getMyoracleConnection();
	}


	@Override
	public int add(Project proj) {
		// TODO Auto-generated method stub
		int numRows = 0;
		try {
			String sqlCall = "{ call addProject(?,?,?,?,?) }";
			CallableStatement st = con.prepareCall(sqlCall);			
			st.setInt(1, proj.getProjectID());
			st.setString(2, proj.getProjectName());
			st.setString(3, proj.getDescriptionOfProject());
			st.setDouble(4, proj.getProjectCost());
			st.registerOutParameter(5, java.sql.Types.NUMERIC);
			st.execute();
			numRows = st.getInt(5);
			return numRows;
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return numRows;

	}

	@Override
	public Project find(int projID) throws NullPointerException{
		String searchQuery = "select * from "  + tableName  +   " where PROJECT_ID = ?";
		try{
			PreparedStatement prepareStatement = this.con.prepareStatement(searchQuery);
			prepareStatement.setInt(1, projID);
			ResultSet output  = prepareStatement.executeQuery();
			
			while(output.next()){
				
				Project obtainedProj  =  new Project(output.getString(2), 
						output.getInt(1), 
						output.getString(3),
						output.getDouble(4));
				obtainedProj.setAmountDonated(output.getDouble(5));
				return obtainedProj;
			}				
		}catch(Exception e){
			e.printStackTrace();
		}
		throw new NullPointerException("The Project could not be found.");
		// TODO Auto-generated method stub
		}


	@Override
	public ArrayList<Project> findAll() {
		ArrayList<Project> projectList =  new ArrayList<Project>();
		String queryString = "select * from " +tableName;
		try{
			PreparedStatement prepareStatement = this.con.prepareStatement(queryString);
			ResultSet allProjects= prepareStatement.executeQuery(); 
			while(allProjects.next()){
				//	private String projectName;
				//	private int projectID;
				//	private String descriptionOfProject;
				//	private double projectCost;
				Project obtainedProj  =  new Project(allProjects.getString(2), 
						allProjects.getInt(1), 
						allProjects.getString(3),
						allProjects.getDouble(4));
				obtainedProj.setAmountDonated(allProjects.getDouble(5));				
				projectList.add(obtainedProj);
		
			}
			return projectList;
		}catch(Exception e){
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return null;		
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		int numRows = 1;
		try {
			String sqlCall = "{ call removeProject(?,?) }";
			CallableStatement st = con.prepareCall(sqlCall);			
			st.setInt(1, id);
			st.registerOutParameter(2, java.sql.Types.NUMERIC);
			st.execute();
			numRows = st.getInt(2);		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return numRows;
	}
	
	//   (JOIN DONORS, DONATIONS) JOINS PROJECTS  
	//  donor,email, 
	//JOIN DONORS, PROJECT, DONATIONS
	//returns a array of key values pairs with variable type
	public ArrayList<Map<String, Object>> getDonationsForProject(int projectID){
		ArrayList<Map<String, Object>> donationProjectResult = new ArrayList<Map<String, Object>>();
		try{	
			//JOINS THE PROJECT WITH THE DONATIONS TABLE
			String sqlCall = "SELECT * FROM DONATIONS D INNER JOIN PROJECTS P ON P.PROJECT_ID= D.PROJECT_ID INNER JOIN DONORS DON ON DON.DONOR_ID =  D.DONOR_ID WHERE P.PROJECT_ID=?";
			PreparedStatement preparedStatment =  this.con.prepareStatement(sqlCall);
			preparedStatment.setInt(1, projectID);
			ResultSet donorsDonationSet =  preparedStatment.executeQuery();
			Map<String, Object> donationProjectData = new HashMap<String,Object>();
			while(donorsDonationSet.next()){
				donationProjectData = new HashMap<String, Object>();		 
				//MORE ELEMENTS CAN BE ADDED HERE
				donationProjectData.put("DONATION_ID", donorsDonationSet.getInt("DONATION_ID"));
				donationProjectData.put("DONATION_AMOUNT", donorsDonationSet.getInt("DONATION_AMOUNT"));
				donationProjectData.put("DONOR_ID", donorsDonationSet.getInt("DONOR_ID"));
				donationProjectData.put("DONOR_NAME", donorsDonationSet.getString("DONOR_NAME"));
				donationProjectData.put("DONOR_EMAIL", donorsDonationSet.getString("DONOR_EMAIL"));
				donationProjectData.put("DONATION_DATE", donorsDonationSet.getDate("DONATION_DATE"));
				donationProjectResult.add(donationProjectData);			
			}

		}catch(Exception e){
			e.printStackTrace();
		}
		return donationProjectResult;
	}
	
	
	
	//projectID 
	//get all the donations for projectID
	//THIS NEED TO BE CHANGED AND IS NOT USED
	//THIS SHOULD UPDATE THE PROJECT  
	public int update(int projID, double donationAmount){
		Project proj = find(projID);
		double amountDonated = proj.getAmountDonated() + donationAmount;
		int numRows = 0;
		try {
			String sqlCall = "{ call updateProjectDonation(?,?, ?) }";
			CallableStatement st = con.prepareCall(sqlCall);	
			st.setInt(1, projID);
			st.setDouble(2, amountDonated);
			st.registerOutParameter(3, java.sql.Types.NUMERIC);
			st.execute();
			numRows = st.getInt(3);		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return numRows;		
	}



}

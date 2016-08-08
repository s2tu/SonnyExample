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
import java.util.Properties;



import daoUtils.DAO;

public class ProjectDao implements DAO<Project>{
	public Connection con;
	public String tableName;
	
	
	public ProjectDao() {
		this.tableName = "PROJECTS";
		FileInputStream inStream;
		try {
			inStream = new FileInputStream(new File("DbConnections.properties"));
			Properties props = new Properties();
			props.load(inStream);
			Class.forName(props.getProperty("db.driverClass"));
			con = DriverManager.getConnection(props.getProperty("db.driverURL"),
											props.getProperty("db.userName"),
											props.getProperty("db.password"));			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
	public Project find(int projID) {
		String searchQuery = "select * from "  + tableName  +   " where PROJECT_ID = ?";
		try{
			PreparedStatement prepareStatement = this.con.prepareStatement(searchQuery);
			prepareStatement.setInt(1, projID);
			ResultSet output  = prepareStatement.executeQuery();
			
			while(output.next()){
				return new Project(output.getString(2), 
						output.getInt(1), 
						output.getString(3),
						output.getDouble(4),
						output.getDouble(5)
						);}
		}catch(Exception e){
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return null;
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
				projectList.add(new Project(allProjects.getString(2), 
						allProjects.getInt(1), 
						allProjects.getString(3),
						allProjects.getDouble(4),
						allProjects.getDouble(5)
						));
		
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
		int numRows = 0;
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

package donorInfo;

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

public class DonorDao implements DAO<Donor>{
	protected Connection con;
	protected String tableName;
	
	public DonorDao() {
		this.tableName = "DONORS";
		this.con = MySQLConnection.getMyoracleConnection();
	}
	

	@Override
	public ArrayList<Donor> findAll(){
		ArrayList<Donor> donorList =  new ArrayList<Donor>();
		String queryString = "select * from " + tableName;
		try{
			PreparedStatement prepareStatement = this.con.prepareStatement(queryString);
			ResultSet allDonors = prepareStatement.executeQuery(); 
			while(allDonors.next()){
			//	private int donorID;
			//	private String name;
			//	private String email;
				donorList.add(new Donor(allDonors.getInt(1), allDonors.getString(2), allDonors.getString(3)));
			}
			return donorList;
		}catch(Exception e){
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return null;		

	}

	@Override
	public int add(Donor donor) {
		int numRows = 0;
		try {
			String sqlCall = "{ call addDonor(?,?,?,?) }";
			CallableStatement st = con.prepareCall(sqlCall);			
			st.setInt(1, donor.getDonorID());
			st.setString(2, donor.getName());
			st.setString(3, donor.getEmail());
			st.registerOutParameter(4, java.sql.Types.NUMERIC);
			st.execute();
			numRows = st.getInt(4);
			return numRows;
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return numRows;	
	}



	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		int numRows = 1;
		try {
			String sqlCall = "{ call deleteDonor(?,?) }";
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


	@Override
	public Donor find(int id) {
		String searchQuery = "select * from " + tableName  +  "where DONOR_ID = ?";
		try{
			PreparedStatement prepareStatement = this.con.prepareStatement(searchQuery);
			prepareStatement.setInt(1, id);
			ResultSet output = prepareStatement.executeQuery();
			while(output.next()){
				return new Donor(output.getInt(1), output.getString(2), output.getString(3));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return null;
	}
	//returns a array of key values pairs with variable type
	public ArrayList<Map<String, Object>> getDonationsForDonor(int donorID){
		ArrayList<Map<String, Object>> donationProjectResult = new ArrayList<Map<String, Object>>();
		try{	
			//JOINS THE PROJECT WITH THE DONATIONS TABLE
			String sqlCall="SELECT * FROM DONATIONS INNER JOIN PROJECTS ON DONATIONS.PROJECT_ID = PROJECTS.PROJECT_ID WHERE DONOR_ID=?";
			PreparedStatement preparedStatment =  this.con.prepareStatement(sqlCall);
			preparedStatment.setInt(1, donorID);
			ResultSet donorsDonationSet =  preparedStatment.executeQuery();
			Map<String, Object> donationProjectData = new HashMap<String,Object>();
			while(donorsDonationSet.next()){
				donationProjectData = new HashMap<String, Object>();		 
				//MORE ELEMENTS CAN BE ADDED HERE
				donationProjectData.put("DONATION_ID", donorsDonationSet.getInt("DONATION_ID"));
				donationProjectData.put("DONOR_ID", donorsDonationSet.getInt("DONOR_ID"));
				donationProjectData.put("DONATION_AMOUNT", donorsDonationSet.getDouble("DONATION_AMOUNT"));
				donationProjectData.put("DONATION_DATE", donorsDonationSet.getDate("DONATION_DATE"));
				donationProjectData.put("PROJECT_NAME", donorsDonationSet.getString("PROJECT_NAME"));
				donationProjectResult.add(donationProjectData);			
			}

		}catch(Exception e){
			e.printStackTrace();
		}
		return donationProjectResult;
	}
}

package donorInfo;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Array;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.sql.Date;
import java.util.Properties;

import daoUtils.DAO;
import daoUtils.MySQLConnection;
import projectInfo.Project;

public class DonationsDao implements DAO<Donation>{
	protected Connection con;
	protected String tableName;
	public DonationsDao(){
		this.tableName = "DONATIONS";
		this.con = MySQLConnection.getMyoracleConnection();
	}
	@Override
	public Donation find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int add(Donation donation) {
		int numRows = 0;
		String sqlCall = "{ call addDonation(? ? ? ? ? ?)}";
		try {
			//DONATION_ID	DONOR_ID	PROJECT_ID	DONATION_AMOUNT	DONATION_DATE
			CallableStatement st =  this.con.prepareCall(sqlCall);
			st.setInt(1, donation.getDonationID());
			st.setInt(2, donation.getDonorID());
			st.setInt(3, donation.getProjectId());
			st.setDouble(4, donation.getAmount());
			Calendar cal = Calendar.getInstance();
			st.setDate(5, new Date(cal.getTimeInMillis()));
			st.registerOutParameter(6, java.sql.Types.NUMERIC);	
			st.execute();
			numRows =  st.getInt(6);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return numRows;
	}

	@Override
	public ArrayList<Donation> findAll() {
		String sqlCall = "{ call findAllDonations(?) }";
		ArrayList<Donation> donationList  =  new ArrayList<Donation>();
		try{
			CallableStatement callablestatement = this.con.prepareCall(sqlCall);
			//you might have to check if this returns true or false
			callablestatement.execute();
			callablestatement.registerOutParameter(1, java.sql.Types.REF_CURSOR);
			ResultSet allDonations= callablestatement.getArray(1).getResultSet();
			while(allDonations.next()){
				
				donationList.add(new Donation(allDonations.getInt(1),
								allDonations.getInt(2), 
								allDonations.getInt(3), 
								allDonations.getDouble(4),
								allDonations.getDate(5)));
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return donationList;

	}

	@Override
	public int delete(int donationID) {
		String sqlCall = "{ call deleteDonation(? ?) }";
		int numRows = 0;
		try{
			CallableStatement callablestatement = this.con.prepareCall(sqlCall);
			callablestatement.setInt(1, donationID);
			callablestatement.registerOutParameter(2, java.sql.Types.NUMERIC);
			callablestatement.execute();
			numRows = callablestatement.getInt(2);
		}catch(Exception e){
			
		}
		return numRows;
	}
	//returns a array of key values pairs with variable type
	public ArrayList<Map<String, Object>> getDonationsForDonor(int donorID){
		ArrayList<Map<String, Object>> donationProjectResult = new ArrayList<Map<String, Object>>();
		try{	
			//JOINS THE PROJECT WITH THE DONATIONS TABLE
			String sqlCall = "SELECT * FROM " + this.tableName +  " INNER JOIN PROJECTS ON DONATIONS.PROJECT_ID = PROJECTS.PROJECT_ID"
		    + " WHERE DONOR_ID=?";
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

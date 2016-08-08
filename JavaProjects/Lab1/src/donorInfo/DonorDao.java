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
import java.util.Properties;

import daoUtils.DAO;

public class DonorDao implements DAO<Donor>{
	public Connection con;
	public String tableName;
	
	public DonorDao() {
		FileInputStream inStream;
		try {
			this.tableName = "DONORS";
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
		int numRows = 0;
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

}

package donationInfo;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.sql.Date;
import daoUtils.DAO;
import daoUtils.MySQLConnection;
import oracle.jdbc.driver.OracleTypes;


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
		String sqlCall = "{ call addDonation(?,?,?,?,?,?) }";
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
			callablestatement.registerOutParameter(1, OracleTypes.CURSOR);
			callablestatement.execute();
			ResultSet allDonations= (ResultSet)callablestatement.getObject(1);
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
		String sqlCall = "{ call deleteDonation(?,?) }";
		int numRows = 1;
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


}

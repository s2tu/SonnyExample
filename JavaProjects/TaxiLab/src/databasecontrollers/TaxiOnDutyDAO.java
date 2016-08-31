package databasecontrollers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;

import domains.TaxiOnDutyData;
import interfaces.DAO;
import loggers.GlobalLogger;

public class TaxiOnDutyDAO implements DAO<TaxiOnDutyData>{
	Connection con;
	public TaxiOnDutyDAO(){
		this.con = com.training.utils.MySQLConnection.getMyoracleConnection();
	}
	
	@Override
	public int add(TaxiOnDutyData item) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int remove(TaxiOnDutyData item) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(TaxiOnDutyData item) {
		String searchQuery = "UPDATE TaxiOnDuty SET CABTYPE=? ,DRIVERNAME=? ,CURLOCATION=? ,AVAILABILITY=? WHERE CABNUM=?";
		try{
			PreparedStatement prepareStatement = this.con.prepareStatement(searchQuery);
			prepareStatement.setString(1, item.getCabType());
			prepareStatement.setString(2, item.getDriverName());
			prepareStatement.setString(3, item.getCurLocation());
			prepareStatement.setString(4, item.getAvailability());
			prepareStatement.setString(5, item.getCabNum());
			int output =  prepareStatement.executeUpdate();
			System.out.println(output);
			return output;
		}catch(Exception e){
			GlobalLogger.infolog.log(Level.WARNING, "Error Updating TaxiOnDutyData");
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return 0;	
	}
	
	public TaxiOnDutyData get(String cabNum){
		String searchQuery = "select * from TaxiOnDuty where CABNUM=?";
		try{
			PreparedStatement prepareStatement = this.con.prepareStatement(searchQuery);
			prepareStatement.setString(1, cabNum);
			ResultSet output = prepareStatement.executeQuery();
			while(output.next()){
				
				TaxiOnDutyData obtainedData = new TaxiOnDutyData(output.getString(1), output.getString(2), output.getString(3), output.getString(4), output.getString(5));
				GlobalLogger.infolog.log(Level.INFO, "Database Obtained TaxiOnGoingData from " + obtainedData.toString());
				return obtainedData;
			}

		}catch(Exception e){
			GlobalLogger.infolog.log(Level.WARNING, "Error Obtaining Available Drivers.");
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return null;		
	}
	public ArrayList<TaxiOnDutyData> getAll(){
		ArrayList<TaxiOnDutyData> outputData = new ArrayList<TaxiOnDutyData>(); 
		String searchQuery = "select * from TaxiOnDuty where AVAILABILITY='FREE'";
		try{
			PreparedStatement prepareStatement = this.con.prepareStatement(searchQuery);
			ResultSet output = prepareStatement.executeQuery();
			while(output.next()){
				TaxiOnDutyData obtainedData = new TaxiOnDutyData(output.getString(1), output.getString(2), output.getString(3), output.getString(3), output.getString(4));
				GlobalLogger.infolog.log(Level.INFO, "Database Obtained TaxiOnGoingData from " + obtainedData.toString());
				outputData.add(obtainedData);
			}
			
			return outputData;
		}catch(Exception e){
			GlobalLogger.infolog.log(Level.WARNING, "Error Obtaining Available Drivers.");
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return null;
		
	}

}

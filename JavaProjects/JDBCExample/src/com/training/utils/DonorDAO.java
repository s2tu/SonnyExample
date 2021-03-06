package com.training.utils;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.domains.Donor;

import interfaces.MyDAO;

public class DonorDAO implements MyDAO<Donor>{
	private Connection con = null;
	
	/**
	 *get the default connection
	 */
	public DonorDAO() {
		super();
		this.con = MySQLConnection.getMyoracleConnection();
	}
	
	/**
	 * @param con
	 */
	public DonorDAO(Connection con) {
		super();
		this.con = con;
	}

	@Override
	public int add(Donor d) {
		// TODO Auto-generated method stub
		int rowAdded = 0;
		
		String sqlAdd = "insert into donors values(?, ? ,?, ?)";
		try{
			PreparedStatement prepareStatment  =  this.con.prepareStatement(sqlAdd);
			/*
			  private long donorCode;
			  private String donorName;
			  private long handPhone;
			  private String email;*/
			prepareStatment.setLong(1, d.getDonorCode());
			prepareStatment.setString(2, d.getDonorName());
			prepareStatment.setLong(3, d.getHandPhone());
			prepareStatment.setString(4, d.getEmail());
			rowAdded = prepareStatment.executeUpdate();
			return rowAdded;
		}catch(SQLException e){
			e.printStackTrace();
		}
		return rowAdded;
	}

	@Override
	public int update(long donorCode, String email) {
		int updateRow = 0;
		String updateQuery = "update donors set email = ? where donorCode = ?";
		PreparedStatement prepareStatement;
		try {
			prepareStatement = con.prepareStatement(updateQuery);
			prepareStatement.setLong(2, donorCode);
			prepareStatement.setString(1, email);
			updateRow = prepareStatement.executeUpdate();
	
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub
		return updateRow;
	}

	@Override
	public int delete(long donorCode) {
		// TODO Auto-generated method stub
		int rowDetelte = 0;
		String sqlDelete= "delete from donors where donorCode = ?";
		try{
			PreparedStatement prepareStatement = this.con.prepareStatement(sqlDelete);
			prepareStatement.setLong(1, donorCode);
			rowDetelte = prepareStatement.executeUpdate(); 
		}catch(Exception e){
			e.printStackTrace();
		}
		return rowDetelte;
	}

	@Override
	public List<Donor> findAll() {
		ArrayList<Donor> donorList =  new ArrayList<Donor>();
		String queryString = "select * from donors";
		try{
			PreparedStatement prepareStatement = this.con.prepareStatement(queryString);
			ResultSet allDonors = prepareStatement.executeQuery(); 
			while(allDonors.next()){
				donorList.add(new Donor(allDonors.getLong(1), allDonors.getString(2), allDonors.getLong(3), allDonors.getString(4)));
			}
			return donorList;
		}catch(Exception e){
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Donor find(long donorID) {
		
		String searchQuery = "select * from donors where donorCode = ?";
		try{
			PreparedStatement prepareStatement = this.con.prepareStatement(searchQuery);
			prepareStatement.setLong(1, donorID);
			ResultSet output  = prepareStatement.executeQuery();
			
			while(output.next()){
				return new Donor(output.getLong(1), output.getString(2), output.getLong(3), output.getString(4));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return null;
	}
	
	public boolean updateStoredProcedure(long donorID, String email){

		try {
			String sqlCall = "{ call updateEmail(?,?,?) }";
			CallableStatement st = con.prepareCall(sqlCall);			
			st.setLong(1, donorID);
			st.setString(2, email);
			st.registerOutParameter(3, java.sql.Types.NUMERIC);
			st.execute();
			return st.getInt(3)== 1;
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}

}

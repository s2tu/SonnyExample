package databasecontrollers;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;

import domains.TaxiUser;
import interfaces.DAO;
import loggers.GlobalLogger;
public class TaxiUserDAO implements DAO<TaxiUser> {
	Connection con;
	public TaxiUserDAO(){
		this.con = com.training.utils.MySQLConnection.getMyoracleConnection();
	}
	
	//since email is the primary key there wont be two instances anyways
	@Override
	public int add(TaxiUser item) {
		// TODO Auto-generated method stub
		int rowAdded = 0;
		String sqlAdd = "insert into TaxiUser values(?, ? ,?, ?, ?)";
		try{
			PreparedStatement prepareStatment  =  this.con.prepareStatement(sqlAdd);
			/*
			 * 	private String email;
				private String password;
				private long phonenumber; 
				private String city;
			 */
			prepareStatment.setString(1, item.getEmail());
			prepareStatment.setString(2, item.getPassword());
			prepareStatment.setLong(3, item.getPhonenumber());
			prepareStatment.setString(4, item.getCity());
			prepareStatment.setString(5, item.getName());
			rowAdded = prepareStatment.executeUpdate();
			return rowAdded;
		}catch(SQLException e){
			e.printStackTrace();
		}
		return rowAdded;		
	}

	@Override
	public int remove(TaxiUser item) {
		return 0;
		// TODO Auto-generated method stub
		
	}

	@Override
	public int update(TaxiUser item) {
		return 0;
		// TODO Auto-generated method stub
	}


	public TaxiUser get(String email) {
		String searchQuery = "select * from TaxiUser where email = ?";
		try{
			PreparedStatement prepareStatement = this.con.prepareStatement(searchQuery);
			prepareStatement.setString(1, email);
			ResultSet output = prepareStatement.executeQuery();
			while(output.next()){
				TaxiUser obtainedUser = new TaxiUser(output.getString(5), output.getString(1), output.getString(2), output.getLong(3), output.getString(4));
				GlobalLogger.infolog.log(Level.INFO, "Database Obtained user from " + email);
				GlobalLogger.infolog.log(Level.INFO, obtainedUser.toString());
				return obtainedUser;
			}
		}catch(Exception e){
			GlobalLogger.infolog.log(Level.WARNING, "Member not found for email: " + email);
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return null;
	}
	
	

}

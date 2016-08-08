package daoUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Properties;

public interface  DAO <T> {
	/*
	public Connection con;
	public String tableName;
	*/
	/*
	public DAO(String tableName){
		this.tableName = tableName;
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
	*/
	public  T find(int id);
	public int add(T object);
	public   ArrayList<T> findAll();
	
	
	/**
	 * Generic delete which takes a column name and the primary key of the row and removes it 
	 * @param id
	 * @param colName
	 * @return
	 */
	/*
	public int deleteRow(int id, String colName){	
		// TODO Auto-generated method stub
		int rowDetelte = 0;
		String sqlDelete= "delete from " + this.tableName + " where " + colName +  " = ?";
		try{
			PreparedStatement prepareStatement = this.con.prepareStatement(sqlDelete);
			prepareStatement.setLong(1, id);
			rowDetelte = prepareStatement.executeUpdate(); 
		}catch(Exception e){
			e.printStackTrace();
		}
		return rowDetelte;
	}*/
	
	public int delete(int id);

}

package com.training.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.io.*;
public class MySQLConnection {
	public static Connection getMyoracleConnection(){
		Connection con = null;
		try{
			Properties props = new Properties();
			InputStream inStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("DbConnections.properties");
			//FileInputStream inStream = new FileInputStream(new File("DbConnections.properties"));
			props.load(inStream);
			Class.forName(props.getProperty("db.driverClass"));
			con = DriverManager.getConnection(props.getProperty("db.driverURL"),
											props.getProperty("db.userName"),
											props.getProperty("db.password"));
		}catch(Exception e){
			e.printStackTrace();
		}
		return con;
	}
	
	public static void main(String args[]){
		System.out.println(getMyoracleConnection());
	}
	
}

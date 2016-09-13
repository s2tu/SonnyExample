package com.philanthropy.projectInfo.ImageInfo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.philanthropy.daoUtils.DAO;
import com.philanthropy.daoUtils.MySQLConnection;
import com.philanthropy.donorInfo.Donor;

public class ImageDao implements DAO<Image>{
	protected Connection con;
	private String tableName;
	
	public ImageDao() {
		this.tableName = "IMAGES";
		this.con = MySQLConnection.getMyoracleConnection();
		// TODO Auto-generated constructor stub
	}
	@Override
	public Image find(int id) {
		String searchQuery = "select * from " + tableName  +  "where IMAGE_ID = ?";
		try{
			PreparedStatement prepareStatement = this.con.prepareStatement(searchQuery);
			prepareStatement.setInt(1, id);
			ResultSet output = prepareStatement.executeQuery();
			while(output.next()){
				return new Image(output.getInt(1), output.getInt(2), output.getString(3));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int add(Image image) {
		int numRows = 0;
		try {
			String sqlCall = "{ call addImage(?,?,?,?) }";
			CallableStatement st = con.prepareCall(sqlCall);			
			st.setInt(1, image.getImageID());
			st.setInt(2, image.getProjectID());
			st.setString(3, image.getPath());
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
	public ArrayList<Image> findAll(){
		ArrayList<Image> imageList =  new ArrayList<Image>();
		String queryString = "select * from " + tableName;
		try{
			PreparedStatement prepareStatement = this.con.prepareStatement(queryString);
			ResultSet allimages = prepareStatement.executeQuery(); 
			while(allimages.next()){
				imageList.add(new Image(allimages.getInt(1), allimages.getInt(2),  allimages.getString(3)));
			}
			return imageList;
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return null;		

	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		int numRows = 0;
		try {
			String sqlCall = "{ call deleteImage(?,?) }";
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

}

package com.training.apps;

import java.util.ArrayList;

import com.domains.Donor;
import com.training.utils.DonorDAO;
import com.training.utils.MySQLConnection;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(MySQLConnection.getMyoracleConnection());
		/**
		 * 
		 * Create a Interface MyDAO<T>
		 * Interface should have CRUD operations (add, update, delete, findAll
		 * 
		 * Copy the Donor Class from the Previous Example
		 * 
		 * Create a Class Implementing the MYDAO (database access object) Interface
		 * 
		 * Complete the methods
		 * 
		 * Test Code using Application
		 * 
		 * 
		 */
		
		DonorDAO donordao = new DonorDAO();
//		Donor Sonny = new Donor(1, "Sonny1", 232321333,"blah@hotmail.com1");
//		Donor Sonny2 = new Donor(2, "Sonny2", 222222,"blah@hotmail.com2");
//		System.out.println(donordao.add(Sonny));
//		System.out.println(donordao.add(Sonny2));
	
		//donordao.delete(0);
		//ArrayList<Donor> resultSet = (ArrayList<Donor>) donordao.findAll();
		//for(Donor d:resultSet){
		//	System.out.println(d);
		//}
		///donordao.update(1, "tusonny@hotmail.com");
		System.out.println(donordao.updateStoredProcedure(1,"tusonny@gmail.com"));
		System.out.println(donordao.updateStoredProcedure(12323,"tusonny@gmail.com"));
		System.out.println(donordao.find(1));
	}

}

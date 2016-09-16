package com.training;

import javax.jcr.Repository;
import javax.jcr.Session;
import javax.jcr.SimpleCredentials;

import org.apache.jackrabbit.core.TransientRepository;

public class FirstHop {

	public static void main(String[] args) {
		try{
			Repository repository = new TransientRepository();
			Session session = repository.login(new SimpleCredentials("admin", "admin".toCharArray()));
			System.out.println("Vendor Name = " + Repository.REP_VENDOR_DESC);
			System.out.println("Repository desc =" + Repository.REP_NAME_DESC);
			System.out.println("Current User = " + session.getUserID());
			
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}

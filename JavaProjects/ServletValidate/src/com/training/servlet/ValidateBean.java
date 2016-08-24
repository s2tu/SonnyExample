package com.training.servlet;

import java.util.HashMap;

public class ValidateBean {
	String username;
	String password;
	
	HashMap<String, String> userDatabase;
	public ValidateBean() {
		// TODO Auto-generated constructor stub
		userDatabase =  new HashMap<String, String>();
	}
	
	public void init(){
		userDatabase.put("Sonny", "password");
	}
	
	public boolean validate(String username, String password){
		return userDatabase.get(username).equals(password) ;
	}
	
	
}

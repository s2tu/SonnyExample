package com.training.domains;

import org.springframework.stereotype.Component;

@Component
public class User {
	private String username;
	private String password;
	private long phonenumber;
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the phonenumber
	 */
	public long getPhonenumber() {
		return phonenumber;
	}
	/**
	 * @param phonenumber the phonenumber to set
	 */
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	/**
	 * @param username
	 * @param password
	 * @param phonenumber
	 */
	public User(String username, String password, long phonenumber) {
		super();
		this.username = username;
		this.password = password;
		this.phonenumber = phonenumber;
	}
	/**
	 * 
	 */
	public User() {
		super();
	}
	
	
}

package com.training.domains;

public class Address {
	private String street;
	/**
	 * @param street
	 * @param country
	 */
	public Address(String street, String country) {
		super();
		this.street = street;
		this.country = country;
	}
	private String country;


	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}
	/**
	 * 
	 */
	public Address() {
		super();
	}
	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String toString(){
		return "ADDRESS\n   Country:" + this.country + " Street: " + this.street ;
	}
}

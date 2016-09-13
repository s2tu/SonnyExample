package com.training.entities;

public class Donor {
	private long handPhone;
	private String donorName;
	private String email;
	private Address address;
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Donor [handPhone=" + handPhone + ", donorName=" + donorName + ", email=" + email + ", address="
				+ address + "]";
	}
	/**
	 * @return the handPhone
	 */
	public long getHandPhone() {
		return handPhone;
	}
	/**
	 * @param handPhone the handPhone to set
	 */
	public void setHandPhone(long handPhone) {
		this.handPhone = handPhone;
	}
	/**
	 * @return the donorName
	 */
	public String getDonorName() {
		return donorName;
	}
	/**
	 * @param donorName the donorName to set
	 */
	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

    /**
	 * 
	 */
	public Donor() {
		super();
	}
	/**
	 * @param handPhone
	 * @param donorName
	 * @param email
	 * @param address
	 */
	public Donor(long handPhone, String donorName, String email, Address address) {
		super();
		this.handPhone = handPhone;
		this.donorName = donorName;
		this.email = email;
		this.address = address;
	}
}

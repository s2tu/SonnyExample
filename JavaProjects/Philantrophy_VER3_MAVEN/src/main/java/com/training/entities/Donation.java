package com.training.entities;

public class Donation {
	private long donationId;

	private String donorName;
	private double amount;
	/**
	 * @return the donationId
	 */
	public long getDonationId() {
		return donationId;
	}
	/**
	 * @param donationId the donationId to set
	 */
	public void setDonationId(long donationId) {
		this.donationId = donationId;
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
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}
	/**
	 * @param donationId
	 * @param projectId
	 * @param donorName
	 * @param amount
	 */
	public Donation(long donationId,  String donorName, double amount) {
		super();
		//LOG MESSAGE
		this.donationId = donationId;
		this.donorName = donorName;
		this.amount = amount;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Donation [donationId=" + donationId + ", donorName=" + donorName + ", amount=" + amount + "]";
	}
	/**
	 * 
	 */
	public Donation() {
		super();
	}
	
}

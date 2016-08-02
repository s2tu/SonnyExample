package donorInfo;

import java.util.ArrayList;

/**
 * 
 * @author stu1
 * Keeps the data associated to a donor.
 */
public class Donor{
	private int donorID;
	private String name;
	private String email;
	/**
	 * @return the donorID
	 */
	public int getDonorID() {
		return donorID;
	}
	/**
	 * @param donorID the donorID to set
	 */
	public void setDonorID(int donorID) {
		this.donorID = donorID;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
	
	@Override
	public boolean equals(Object obj) {
		Donor newobj = (Donor)obj;
		return (newobj.donorID == donorID && newobj.name == name && newobj.email == email);
		
	};


}

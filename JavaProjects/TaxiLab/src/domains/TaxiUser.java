package domains;

public class TaxiUser {
	//"EMAIL" VARCHAR2(20),"PASSWORD" VARCHAR2(8),"TELEPHONE" NUMBER(10,0),"CITY" VARCHAR2(20), 
	private String name;
	private String email;
	private String password;
	private long phonenumber; 
	private String city;
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
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @param email
	 * @param password
	 * @param phonenumber
	 * @param city
	 */
	public TaxiUser(String name, String email, String password, long phonenumber, String city) {
		super();
		this.setName(name);
		this.email = email;
		this.password = password;
		this.phonenumber = phonenumber;
		this.city = city;
	}
	
	//later disallow people with same email to avoid duplicate accounts
	@Override
	public boolean equals(Object user){
		TaxiUser taxiuser = (TaxiUser)user;
		return (taxiuser.email.equals(email) && taxiuser.password.equals(password)  && taxiuser.city.equals(city));
	}
	
	@Override
	public String toString(){
		return email +"\t" + password + "\t" + phonenumber + "\t" + city;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

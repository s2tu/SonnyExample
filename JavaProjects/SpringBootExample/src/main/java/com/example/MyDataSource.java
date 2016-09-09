package com.example;




public class MyDataSource {
	private String diverClass;
	private String jdbcURL;
	/**
	 * @return the diverClass
	 */
	public String getDiverClass() {
		return diverClass;
	}
	/**
	 * @param diverClass the diverClass to set
	 */
	public void setDiverClass(String diverClass) {
		this.diverClass = diverClass;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "Driver Class:\t" + diverClass + "\nUrl:\t\t" + jdbcURL + "\n";
	}
	/**
	 * @return the jdbcURL
	 */
	public String getJdbcURL() {
		return jdbcURL;
	}
	/**
	 * @param jdbcURL the jdbcURL to set
	 */
	public void setJdbcURL(String jdbcURL) {
		this.jdbcURL = jdbcURL;
	}
	/**
	 * @param diverClass
	 * @param jdbcURL
	 */
	public MyDataSource(String diverClass, String jdbcURL) {
		super();
		this.diverClass = diverClass;
		this.jdbcURL = jdbcURL;
	}
	/**
	 * 
	 */
	public MyDataSource() {
		super();
	}
	
}

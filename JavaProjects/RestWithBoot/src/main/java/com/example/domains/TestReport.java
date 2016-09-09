package com.example.domains;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Component
@JsonIgnoreProperties
public class TestReport {
	@JsonIgnore
	private long reportID;
	private String patientName;
	private String reportType;
	private String result;
	/**
	 * @return the reportID
	 */
	public long getReportID() {
		return reportID;
	}
	/**
	 * @param reportID the reportID to set
	 */
	public void setReportID(long reportID) {
		this.reportID = reportID;
	}
	/**
	 * @return the patientName
	 */
	public String getPatientName() {
		return patientName;
	}
	/**
	 * @param patientName the patientName to set
	 */
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	/**
	 * @return the reportType
	 */
	public String getReportType() {
		return reportType;
	}
	/**
	 * @param reportType the reportType to set
	 */
	public void setReportType(String reportType) {
		this.reportType = reportType;
	}
	/**
	 * @return the result
	 */
	public String getResult() {
		return result;
	}
	/**
	 * @param result the result to set
	 */
	public void setResult(String result) {
		this.result = result;
	}
	/**
	 * @param reportID
	 * @param patientName
	 * @param reportType
	 * @param result
	 */
	public TestReport(long reportID, String patientName, String reportType, String result) {
		super();
		this.reportID = reportID;
		this.patientName = patientName;
		this.reportType = reportType;
		this.result = result;
	}
	/**
	 * 
	 */
	public TestReport() {
		super();
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "Patient Name:" + this.patientName  + " Report ID:" + this.reportID + " Report Type:" + this.reportType  +   " Result:" + this.result;
	}
	
	
}

package com.training.domains;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Patient {
	private static final Logger log = Logger.getLogger("mylogger");
	private long patientId;
	private String patientName;
	private String patientType;
	


	/**
	 * @return the log
	 */
	public static Logger getLog() {
		return log;
	}

	/**
	 * @param patientId
	 * @param patientName
	 * @param patientType
	 */
	public Patient(long patientId, String patientName, String patientType) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientType = patientType;
		log.log(Level.INFO, "Patient Initialized");
	}
	
	public Patient(){
		super();
		log.log(Level.INFO, "Patient Initialized");
	}


	/**
	 * @return the patientId
	 */
	public long getPatientId() {
		return patientId;
	}


	/**
	 * @param patientId the patientId to set
	 */
	public void setPatientId(long patientId) {
		this.patientId = patientId;
		log.log(Level.INFO, "set called");
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
		log.log(Level.INFO, "set called");
	}


	/**
	 * @return the patientType
	 */
	public String getPatientType() {
		return patientType;
	}


	/**
	 * @param patientType the patientType to set
	 */
	public void setPatientType(String patientType) {
		log.log(Level.INFO, "set called");
		this.patientType = patientType;
	}

	@Override
	public String toString(){
		return "Patient [patient="+ patientId + ", patientName=" + patientName + " ,patientType=" + patientType + "]";
	}


}

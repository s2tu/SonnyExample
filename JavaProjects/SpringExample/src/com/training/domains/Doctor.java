package com.training.domains;

import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;

public class Doctor {
	private static final Logger log = Logger.getLogger("doctor");
	private int doctorCode;
	private String doctorName;
	private String specialization;
	private Patient patient;
	private List<Patient> patientList;
	private HashMap<String,String> supportStaff;
	
	/**
	 * @return the supportStaff
	 */
	public HashMap<String, String> getSupportStaff() {
		return supportStaff;
	}

	/**
	 * @param supportStaff the supportStaff to set
	 */
	public void setSupportStaff(HashMap<String, String> supportStaff) {
		this.supportStaff = supportStaff;
	}

	/**
	 * @return the patientList
	 */
	public List<Patient> getPatientList() {
		return patientList;
	}

	/**
	 * @param patientList the patientList to set
	 */
	public void setPatientList(List<Patient> patientList) {
		this.patientList = patientList;
	}

	/**
	 * @param doctorCode
	 * @param docotName
	 * @param specialization
	 */
	public Doctor(int doctorCode, String doctorName, String specialization) {
		super();
		this.doctorCode = doctorCode;
		this.doctorName = doctorName;
		this.specialization = specialization;
		supportStaff = new HashMap<String,String>();
	}
	
	public Doctor(){
		super();
		supportStaff = new HashMap<String,String>();
		
	}
	/**
	 * @return the patient
	 */
	public Patient getPatient() {
		return patient;
	}
	/**
	 * @param patient the patient to set
	 */
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	/**
	 * @return the doctorCode
	 */
	public int getDoctorCode() {
		return doctorCode;
	}
	/**
	 * @param doctorCode the doctorCode to set
	 */
	public void setDoctorCode(int doctorCode) {
		this.doctorCode = doctorCode;
	}
	/**
	 * @return the docotName
	 */
	public String getDoctorName() {
		return doctorName;
	}
	/**
	 * @param docotName the docotName to set
	 */
	public void setDoctorName(String docotName) {
		this.doctorName = docotName;
	}
	/**
	 * @return the specialization
	 */
	public String getSpecialization() {
		return specialization;
	}
	/**
	 * @param specialization the specialization to set
	 */
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	
	
}

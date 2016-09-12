package com.training.entity;

import java.util.Set;

public class Training {
	private int trainingCode;
	/**
	 * 
	 */
	public Training() {
		super();
	}
	/**
	 * @param trainingCode
	 * @param trainerName
	 * @param participants
	 */
	public Training(int trainingCode, String trainerName, Set<Participant> participants) {
		super();
		this.trainingCode = trainingCode;
		this.trainerName = trainerName;
		this.participants = participants;
	}
	/**
	 * @return the trainingCode
	 */
	public int getTrainingCode() {
		return trainingCode;
	}
	/**
	 * @param trainingCode the trainingCode to set
	 */
	public void setTrainingCode(int trainingCode) {
		this.trainingCode = trainingCode;
	}
	/**
	 * @return the trainerName
	 */
	public String getTrainerName() {
		return trainerName;
	}
	/**
	 * @param trainerName the trainerName to set
	 */
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	/**
	 * @return the participants
	 */
	public Set<Participant> getParticipants() {
		return participants;
	}
	/**
	 * @param participants the participants to set
	 */
	public void setParticipants(Set<Participant> participants) {
		this.participants = participants;
	}
	private String trainerName;
	private Set<Participant> participants;
	
}

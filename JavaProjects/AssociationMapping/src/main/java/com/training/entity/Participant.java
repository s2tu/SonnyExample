package com.training.entity;

public class Participant {
	private long participantCode;
	private String partcipantName;
	/**
	 * @return the participantCode
	 */
	public long getParticipantCode() {
		return participantCode;
	}
	/**
	 * @param participantCode the participantCode to set
	 */
	public void setParticipantCode(long participantCode) {
		this.participantCode = participantCode;
	}
	/**
	 * @return the partcipantName
	 */
	public String getPartcipantName() {
		return partcipantName;
	}
	/**
	 * @param partcipantName the partcipantName to set
	 */
	public void setPartcipantName(String partcipantName) {
		this.partcipantName = partcipantName;
	}
	/**
	 * 
	 */
	public Participant() {
		super();
	}
	/**
	 * @param participantCode
	 * @param partcipantName
	 */
	public Participant(long participantCode, String partcipantName) {
		super();
		this.participantCode = participantCode;
		this.partcipantName = partcipantName;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Participant [participantCode=" + participantCode + ", partcipantName=" + partcipantName + "]";
	}
	
}

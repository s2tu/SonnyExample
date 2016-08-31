package domains;



public class TaxiOnDutyData {
	private String cabNum;
	private String cabType;
	private String driverName;
	private String curLocation;
	private String availability;
	public TaxiOnDutyData(String cabNum, String cabType, String driverName, String curLocation, String availability) {
		super();
		this.cabNum = cabNum;
		this.cabType = cabType;
		this.driverName = driverName;
		this.curLocation = curLocation;
		this.availability = availability;
	}
	
	/**
	 * @return the availability
	 */
	public String getAvailability() {
		return availability;
	}
	/**
	 * @param availability the availability to set
	 */
	public void setAvailability(String availability) {
		this.availability = availability;
	}



	/**
	 * @param cabNum
	 * @param cabType
	 * @param driverName
	 * @param curLocation
	 * @param dutyDate
	 */
	
	public String getCabNum() {
		return cabNum;
	}
	public void setCabNum(String cabNum) {
		this.cabNum = cabNum;
	}
	public String getCabType() {
		return cabType;
	}
	public void setCabType(String cabType) {
		this.cabType = cabType;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getCurLocation() {
		return curLocation;
	}
	public void setCurLocation(String curLocation) {
		this.curLocation = curLocation;
	}


	@Override
	public String toString(){
		return this.cabNum + "-" + this.cabType + "-" + this.curLocation + "-" + this.driverName  + "-" + this.availability;
	}
	
}

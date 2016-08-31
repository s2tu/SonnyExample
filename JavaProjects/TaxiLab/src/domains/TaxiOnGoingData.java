package domains;

import java.sql.Timestamp;

public class TaxiOnGoingData {

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
	public Timestamp getDutyDate() {
		return dutyDate;
	}
	public void setDutyDate(Timestamp dutyDate) {
		this.dutyDate = dutyDate;
	}
	private String cabNum;
	private String cabType;
	private String driverName;
	private String curLocation;
	private Timestamp dutyDate;
	
}

package managers;

import java.util.ArrayList;
import java.util.logging.Level;

import databasecontrollers.TaxiOnDutyDAO;
import databasecontrollers.TaxiUserDAO;
import domains.TaxiOnDutyData;
import domains.TaxiUser;
import loggers.GlobalLogger;

public class TaxiService {
	private TaxiUserDAO taxiManager;
	private TaxiOnDutyDAO taxiOnGoingManager; 
	
	
	public TaxiService(){
		this.taxiManager = new TaxiUserDAO();
		this.taxiOnGoingManager = new TaxiOnDutyDAO();
	}
	
	//Taxi User Services
	public TaxiUser getUser(String email){
		return this.taxiManager.get(email);
	}
	public int addTaxiUser(TaxiUser user){
		int output = taxiManager.add(user);
		if (output == 0){
			GlobalLogger.infolog.info("Adding Taxi User failed.");
		}else{
			GlobalLogger.infolog.info("Added member successfully");
		}
		return output;
	}
	public boolean validate(TaxiUser user){	
		TaxiUser obtainedDBuser = taxiManager.get(user.getEmail());	
		if(obtainedDBuser == null){
			GlobalLogger.infolog.info("User Not Found.");
			return false;
		}
		
		GlobalLogger.infolog.info("Validating The following User");
		GlobalLogger.infolog.info(user.toString());
		
		if(obtainedDBuser.equals(user)){
			GlobalLogger.infolog.info("This user is a valid user.  Authentication Success.");
		}else{
			GlobalLogger.infolog.info("This user is not a valid user. Authentication Failed.");
		}
		return obtainedDBuser.equals(user);	
	}
	
	//Taxi on Duty Services
	//this function should return an arraylist of all available cabs
	//for a given location
	public ArrayList<TaxiOnDutyData> getAvailableCabs(String location){
		return this.taxiOnGoingManager.getAllLocation(location);
	}
	public void changeCabAvailablity(String cabNum){
		
		
		TaxiOnDutyData cabData = taxiOnGoingManager.get(cabNum);
		
		System.out.println(cabData.getAvailability());
		
		if((cabData.getAvailability()).equals("FREE")){
			cabData.setAvailability("ONDUTY");
		}else{
			cabData.setAvailability("FREE");
		}
		
		GlobalLogger.infolog.info("Changing the Availability for " + cabNum + " to " + cabData.getAvailability());
		taxiOnGoingManager.update(cabData);
		
	}

	

}

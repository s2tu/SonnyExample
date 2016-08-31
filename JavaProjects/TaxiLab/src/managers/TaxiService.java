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
			GlobalLogger.infolog.log(Level.WARNING, "Adding Taxi User failed.");
		}else{
			GlobalLogger.infolog.log(Level.INFO, "Added member successfully");
		}
		return output;
	}
	public boolean validate(TaxiUser user){	
		TaxiUser obtainedDBuser = taxiManager.get(user.getEmail());	
		if(obtainedDBuser == null){
			GlobalLogger.infolog.log(Level.WARNING, "User Not Found.");
			return false;
		}
		
		GlobalLogger.infolog.log(Level.INFO, "Validating The following User");
		GlobalLogger.infolog.log(Level.INFO, user.toString());
		
		if(obtainedDBuser.equals(user)){
			GlobalLogger.infolog.log(Level.INFO, "This user is a valid user.  Authentication Success.");
		}else{
			GlobalLogger.infolog.log(Level.INFO, "This user is not a valid user. Authentication Failed.");
		}
		return obtainedDBuser.equals(user);	
	}
	
	//Taxi on Duty Services
	//this function should return an arraylist of all available cabs
	public ArrayList<TaxiOnDutyData> getAvailableCabs(){
		return this.taxiOnGoingManager.getAll();
	}
	public void changeCabAvailablity(String cabNum){
		
		
		TaxiOnDutyData cabData = taxiOnGoingManager.get(cabNum);
		
		System.out.println(cabData.getAvailability());
		
		if((cabData.getAvailability()).equals("FREE")){
			cabData.setAvailability("ONDUTY");
		}else{
			cabData.setAvailability("FREE");
		}
		
		GlobalLogger.infolog.log(Level.INFO, "Changing the Availability for " + cabNum + " to " + cabData.getAvailability());
		taxiOnGoingManager.update(cabData);
		
	}

	

}

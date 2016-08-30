package managers;

import java.util.logging.Level;

import databasecontrollers.TaxiDAO;
import domains.TaxiUser;
import loggers.GlobalLogger;

public class TaxiService {
	private TaxiDAO taxiManager;
	
	public TaxiService(){
		this.taxiManager = new TaxiDAO();
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
	

}

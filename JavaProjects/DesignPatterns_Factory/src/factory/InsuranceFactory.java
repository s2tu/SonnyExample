package factory;

import insurance.HealthInsurance;
import insurance.Insurance;
import insurance.LifeInsurance;
import insurance.VehicleInsurance;

public class InsuranceFactory implements Factory<Insurance>{

	
	public enum insuranceTypes {
		HEALTH(0), LIFE(1), VEHICLE(2);
		 
		 private int code;
		 
		 private insuranceTypes(int c) {
		   code = c;
		 }
		 
		 
		
	}

	@Override
	public Insurance getInstance(Object key) {
		switch((insuranceTypes)key){
			case HEALTH:
				return new HealthInsurance();
			case LIFE:
				return new LifeInsurance();
			case VEHICLE:
				return new VehicleInsurance();
		}
		// TODO Auto-generated method stub
		return null;
	}


		 
		 

	
	




}

package factory;

import insurance.HealthInsurance;
import insurance.Insurance;

public class FactoryClient {

	public static void main(String[] args) {
		// factory just returns a concrete class of a abstract class
		//the factory can also be written as a static therefore you don't have to create it 
		InsuranceFactory iFactory = new InsuranceFactory();
		Insurance hi = iFactory.getInstance(InsuranceFactory.insuranceTypes.HEALTH);
		hi.displayTypeInsurance();
		Insurance vi = iFactory.getInstance(InsuranceFactory.insuranceTypes.VEHICLE);
		vi.displayTypeInsurance();		
		
		
	}

}

package adapter;

//an account for saving... what a concept
public class SavingsAccount implements BankAccount{

	@Override
	public double calculate() {
		return getServiceCharge();
	}
	
	//I guess we have service charges? :/ 
	public double getServiceCharge(){
		return 1000.00;
	}

}

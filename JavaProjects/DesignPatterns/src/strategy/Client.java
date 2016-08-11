package strategy;

public class Client {
	public static void main(String args[]){
		PatientContext patient1 = new PatientContext();
		patient1.setStrategy(new CardPayment());
		patient1.makePayment(560);
		
		PatientContext patient2 = new PatientContext();
		patient2.setStrategy(new CashPayment());
		patient2.makePayment(5600);
	}
}

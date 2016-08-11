package strategy;

public class PatientContext {
	private PaymentStrategy strategy;
	
	public void setStrategy(PaymentStrategy strategy){
		this.strategy = strategy;
	}
	public void makePayment(double amount){
		strategy.pay(amount);
	}
	
}

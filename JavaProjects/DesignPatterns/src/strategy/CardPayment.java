package strategy;

public class CardPayment implements PaymentStrategy {

	@Override
	public void pay(double amount) {
		System.out.println(amount + " Payment Received through Credit Card");
		
	}

}

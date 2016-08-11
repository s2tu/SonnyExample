package strategy;

public class CashPayment implements PaymentStrategy{

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println(amount +  "Payment was in CASH");
	}

}

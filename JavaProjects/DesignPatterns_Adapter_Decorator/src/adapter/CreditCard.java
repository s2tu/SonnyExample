package adapter;

//Credit card is the adapteeeeee
public class CreditCard {

	private double balanceDue;
	
	public CreditCard(double balance){
		this.balanceDue = balance;
	}
	
	public double calculateMinimumAmount(){
		return balanceDue * 0.5;
	}
}

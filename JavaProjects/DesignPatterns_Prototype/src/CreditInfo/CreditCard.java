package CreditInfo;

public class CreditCard implements Cloneable{
	private long cardNumber;
	private String cardHolderName;
	private String creditRating;
	private double creditLimit;
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return  super.clone();
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}
}

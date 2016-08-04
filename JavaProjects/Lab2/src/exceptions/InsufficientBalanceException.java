package exceptions;

public class InsufficientBalanceException extends Exception{
	static String message = "The account does not have sufficient amount of money.";
	public InsufficientBalanceException(){
		super(message);
	}
}

package exceptions;

public class InvalidInputException extends Exception{
	static String message = "The input is invalid.";
	public InvalidInputException(){
		super(message);
	}
}

package domains;

import java.io.Serializable;

public class Invoice implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int invoiceNumber;
	private String accountname;
	//private  double  amount2;
	private transient double  amount;
	/**
	 * @param invoiceNumber
	 * @param customerName
	 * @param amount
	 */
	public Invoice(int invoiceNumber, String customerName, double amount) {
		super();
		this.invoiceNumber = invoiceNumber;
		this.accountname = customerName;
		this.amount = amount;
	}
	@Override
	public String toString(){
		return  this.invoiceNumber + ":" + this.accountname + ":" + this.amount ;
	}
	
}

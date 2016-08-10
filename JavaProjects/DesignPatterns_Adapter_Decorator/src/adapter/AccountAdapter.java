package adapter;

//note how the Adapter EXTENDS the Target. Allows this class to have the functionality
//that the component class desires
public class AccountAdapter extends SavingsAccount {
	
	//contains an instance of credit card
	//will connect the credit card to the bankaccount functionality :) 
	private CreditCard card;
	
	//gimme a card
	public AccountAdapter(CreditCard card){
		this.card = card;
	}

	//override calculate to return credit card's due with account's amount due???
	@Override
	public double calculate() {
		double totalDue = card.calculateMinimumAmount() + super.calculate();
		return totalDue;
	}

}

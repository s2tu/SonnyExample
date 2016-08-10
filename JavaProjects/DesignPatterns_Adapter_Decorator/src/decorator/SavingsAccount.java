package decorator;

public class SavingsAccount extends BankAccount {
	
	@Override
	public double getBalanceToMaintain(){
		return 1000;
	}
	
	public SavingsAccount(){
		super();
	}

}

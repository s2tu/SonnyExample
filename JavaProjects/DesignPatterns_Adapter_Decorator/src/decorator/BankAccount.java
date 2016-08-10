package decorator;

//This is the abstract class that everything being decorated/decorating extends...
public abstract class BankAccount {
	
	private double balanceToMaintain;

	//here's the method we're testing with in this example
	public double getBalanceToMaintain(){
		return this.balanceToMaintain;
	}

}

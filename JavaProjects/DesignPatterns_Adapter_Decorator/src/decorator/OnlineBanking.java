package decorator;

//A decorator
public class OnlineBanking extends FeatureDecorator{
	
	private BankAccount member;
	
	public OnlineBanking (BankAccount member){
		this.member = member;
	}
	
	public double getBalanceToMaintain(){
		return this.member.getBalanceToMaintain() + 1000;
	}
}

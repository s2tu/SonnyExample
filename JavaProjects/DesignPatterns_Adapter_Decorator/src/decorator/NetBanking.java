package decorator;

//A decorator
public class NetBanking extends FeatureDecorator {
	
	private BankAccount member;

	public NetBanking(BankAccount member){
		this.member = member;
	}
	
	public double getBalanceToMaintain(){
		return this.member.getBalanceToMaintain() + 1000;
	}
}

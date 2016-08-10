package decorator;

import java.text.DecimalFormat;

//test class... pretty self explanatory 
public class DecoratorClient {

	public static void main(String[] args){
		DecimalFormat df = new DecimalFormat("#.00");
		
		SavingsAccount account = new SavingsAccount();
		
		System.out.println("SavingsAccount balance to maintain: $" + df.format(account.getBalanceToMaintain()));
		
		NetBanking net = new NetBanking(account);
		
		System.out.println("Wrapped SavingsAccount with NetBanking. Balance to maintain: $" + df.format(net.getBalanceToMaintain()));
		
		OnlineBanking online = new OnlineBanking(net);
		
		System.out.println("Wrapped NetBanking with OnlineBanking. Balance to maintain: $" + df.format(online.getBalanceToMaintain()));
		System.out.println("Wow. Natalie is so cool for completing these examples. :D ");
	}
}

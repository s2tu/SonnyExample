package adapter;

public class AdapterClient {
	
	public static void main(String[] args){
		CreditCard card = new CreditCard(4500);
		
		AccountAdapter adapter = new AccountAdapter(card);
		
		System.out.println(adapter.calculate());
	}

}

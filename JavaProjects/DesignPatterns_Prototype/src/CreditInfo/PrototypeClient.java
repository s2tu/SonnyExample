package CreditInfo;

public class PrototypeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCard card = new CreditCard();
		card.setCreditLimit(100);
		
		System.out.println(card.hashCode());
		CardCache cache  = new CardCache();
		cache.loadProduct(card);	

		try{
			CreditCard card3 = cache.getCachedCard();
			card3.setCreditLimit(200);
			System.out.println(card3.hashCode());
			System.out.println(card3.getCreditLimit());
			System.out.println(card.getCreditLimit());
			
			
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
	}

}

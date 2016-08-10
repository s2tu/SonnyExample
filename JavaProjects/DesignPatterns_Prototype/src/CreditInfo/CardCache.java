package CreditInfo;

public class CardCache {
	private CreditCard card;
	
	public CreditCard loadProduct(CreditCard card){
		this.card = card;
		return card;
	}
	public CreditCard getCachedCard() throws CloneNotSupportedException{
		return (CreditCard)card.clone();
	}
	
	public CreditCard getCard(){
		return card;
	}
}

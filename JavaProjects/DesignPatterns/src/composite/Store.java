package composite;

public class Store implements Profitable{
	private String name;
	
	private double profit;

	/**
	 * @param name the name to set
	 */
	public Store(String name, double profit) {
		this.name = name;
		this.profit = profit;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	@Override
	public double getProfit() {
		// TODO Auto-generated method stub
		return profit;
	}

	@Override
	public void addLeaf(Profitable child) {
		// TODO Auto-generated method stub
		//DO NOTHING!
		
	}

	@Override
	public void removeLeaf(Profitable child) {
		// TODO Auto-generated method stub
		//DO NOTHING!
		
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof Store){
			return ((((Store) obj).getName()).equals(name));
		}
		
		return false;
	}
}

package composite;

import java.util.ArrayList;

public class City implements Profitable{

	private ArrayList<Profitable> stores;
	private double profit; 
	
	public City(double profit ) {
		this.profit = profit;
		stores = new ArrayList<Profitable>();
	}
	@Override
	public double getProfit() {
		double total = profit;
		for(Profitable p: stores){
			total = total  + p.getProfit();			
		}
		// TODO Auto-generated method stub
		return total;
	}

	@Override
	public void addLeaf(Profitable child) {
		if(child instanceof Store){
			stores.add(child);
			// TODO Auto-generated method stub
		}
	}

	@Override
	public void removeLeaf(Profitable child) {
		stores.remove(child);
		// TODO Auto-generated method stub	
	}
	//has multiple cities
}

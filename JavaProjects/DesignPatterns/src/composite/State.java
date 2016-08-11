package composite;

import java.util.ArrayList;

public class State implements Profitable{
	private ArrayList<Profitable> cities;
	double profit;

	public State(double profit) {
		this.profit = profit;
		cities = new ArrayList<Profitable>();
	}
	@Override
	public double getProfit() {
		double total = profit;
		for(Profitable p: cities){
			total = total  + p.getProfit();			
		}
		// TODO Auto-generated method stub
		return total;
	}

	@Override
	public void addLeaf(Profitable child) {
		if(child instanceof City){
			cities.add(child);
			// TODO Auto-generated method stub
		}
	}

	@Override
	public void removeLeaf(Profitable child) {
		cities.remove(child);
		// TODO Auto-generated method stub	
	}
	//has multiple cities
}

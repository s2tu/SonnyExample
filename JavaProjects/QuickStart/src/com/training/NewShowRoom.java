package com.training;

public class NewShowRoom extends ShowRoom{
	
	/***
	 * Overrides  the getproduct to include Bikes
	 */
	@Override
	public IAutomobile getProduct(int ch){
		
		IAutomobile auto = null;
		if(ch == 4){
			auto = new Bike();
		}else{
			auto = super.getProduct(ch);
		}
		return auto;
		
	}

}

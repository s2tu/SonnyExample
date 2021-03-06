package com.training;

public class ShowRoom {
	/**
	 * Obtains the car based on a numerical input
	 * @param ch
	 * @return
	 */
	public IAutomobile getProduct(int ch){
		IAutomobile auto = null;
		switch(ch){
		case 1:
			auto= new MarutiCar();
			break;
		case 2:
			auto=new ToyotaCar();
			break;
		case 3:
			auto=new HyundaiCar();
			break;
		}
		return auto;
	}

	/**
	 * At run time it decides which object it will be and print the items associated to it 
	 * This part shows how polymorphism is used. 
	 * @param polyAuto
	 */
	public void printQuote(IAutomobile polyAuto){
		System.out.println(IAutomobile.SHOWROOMNAME);
		System.out.println("Model:="+ polyAuto.getModel() );
		System.out.println("Color:="+ polyAuto.getColor() );
		System.out.println("Price:="+ polyAuto.getPrice() );
	}

}

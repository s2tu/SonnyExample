package com.training;

import java.util.Scanner;

public class Application5 {
	/**
	 * Main Application
	 * @param args
	 */
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Select your car (1-4)");
		int input = in.nextInt();
		ShowRoom carshow = new NewShowRoom();
		IAutomobile autom = carshow.getProduct(input);
		if(autom != null){
			carshow.printQuote(autom);
		}else{
			System.out.println("Invalid option.");
		}
		
		in.close();
	}

}

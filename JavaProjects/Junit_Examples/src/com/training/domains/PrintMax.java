package com.training.domains;

public class PrintMax {
	//defect is here
	public int findMax(int[] args){
		int output = args[0];
		for(int i = 0; i < args.length; i++){

				if(args[i] > output){
					output = args[i];
				}

		}
		
		return output;
	
		
	}
}

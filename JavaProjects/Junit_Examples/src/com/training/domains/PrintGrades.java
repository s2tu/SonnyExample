package com.training.domains;

import java.util.ArrayList;

public class PrintGrades { //this is a defect because of the 35 case is not checked
	public String findResult(int mark){
		String grade="O";
		if(mark<=35){
			grade="D";
		}else if(mark > 35 && mark <60){
			grade="C";
		}else{
		
			grade="B";
		}
		//ArrayList test = ArrayList();
		//test.
		return grade;
		
		
	}
	
}

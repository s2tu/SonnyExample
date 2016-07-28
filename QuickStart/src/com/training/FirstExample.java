package com.training;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class FirstExample {
	
	public static String underStandFinally(){
		String number ="Four";

		try{
			int val = Integer.parseInt(number);
			System.out.println("Value" + val);
		}catch(NumberFormatException e){
				System.out.println(e.getMessage());
				return "Caught";
			
		}finally{
			System.out.println( "Inside Finally is launched");
		}
		System.out.println( "Method End");
		return null;
	}
	
	public static void main(String []args){
		String s = "Hello";
		
		try{
			//throw new IOException("Test");
			String test = underStandFinally();
			System.out.println(test);	
			
		}catch(NullPointerException e){
			//out in and err
			System.err.println("String Value is Null - Check");
			System.err.println(e.getMessage()); 	
		
		}
		catch(Exception e){
			System.out.println("Other Exception");	
		}
		finally{
			System.out.println("***Finally is launched.***");		
		}
		System.out.println("Finsihed");		
	}
}

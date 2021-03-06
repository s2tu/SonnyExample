package application;

import java.util.ArrayList;
import java.util.List;

import domains.Invoice;
import domains.InvoiceIO;
import domains.Utilities;

public class Application {

	public static void main(String[] args) {
		
		
		//Example1 
		// TODO Auto-generated method stub
	//	Utilities tools = new Utilities();
	//	Invoice test = new Invoice(1, "Sonny", 100000);
	//	System.out.println(test);
		//tools.serializing(test);
		
		//if you modified the class and deserialized before serializing then you get issues
		//error because the class are different
		//if you change the version number it also will give an error
		
	//	Invoice test3 = tools.deserializing();
	//	System.out.println(test3);
		
		
		//Example 2
		Invoice test = new Invoice(1, "Sonny", 100000);
		Invoice test1 = new Invoice(2, "Sonny2", 100000);
		Invoice test2 = new Invoice(3, "Sonny3", 100000);
		Invoice test3 = new Invoice(4, "Sonny4", 100000);
		Invoice test4 = new Invoice(5, "Sonny5", 100000);
		
		List inv = new ArrayList<Invoice>();
		inv.add(test);
		inv.add(test1);
		inv.add(test2);
		inv.add(test3);
		inv.add(test4);
		
		InvoiceIO invoiceio = new InvoiceIO();
		invoiceio.writeDetails(inv);
		
		List inv2 = (List) invoiceio.readDetails();
		for(Object i: inv2){
			System.out.println(i);
		}
		
	}

}

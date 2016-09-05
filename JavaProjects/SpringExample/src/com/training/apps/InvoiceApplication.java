package com.training.apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.domains.Invoice;

public class InvoiceApplication {

	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml")){
			Invoice inv = ctx.getBean(Invoice.class);
			System.out.println(inv.toString());
			
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}

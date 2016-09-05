package com.training.apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.domains.LifeInsurance;

public class Application {

	public static void main(String args[]){
		try{
			ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
			LifeInsurance insurance = ctx.getBean(LifeInsurance.class);
			System.out.println("Policy Number: " + insurance.getPolicyNumber());
			System.out.println("Policy Amount: " + insurance.getPolicyAmount());
			System.out.println("First Premium: " + insurance.findFirstPremium());
			
			
			System.out.println("Customer Id: " + insurance.getCust().getCustId());
			System.out.println("Customer Name: " + insurance.getCust().getCustomerName());
			ctx.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

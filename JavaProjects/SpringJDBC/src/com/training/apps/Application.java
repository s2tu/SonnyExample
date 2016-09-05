package com.training.apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.daos.CustomerDao;
import com.training.entity.Customer;
import com.training.ifaces.MyDao;



public class Application {

	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");){
			CustomerDao dao = ctx.getBean(CustomerDao.class);
			//Customer cust = ctx.getBean(Customer.class);
		
			for( Customer c: dao.findAll()){
				System.out.println(c);
			}
			System.out.println(dao.find((long) 102.0));
		
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	

}

package com.training.apps;

import org.service.daos.ShoppingCartDaoImpl;
import org.service.entity.ShoppingCart;
import org.service.iFaces.MyDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String args[]){
		ClassPathXmlApplicationContext contxt = new ClassPathXmlApplicationContext("bean.xml");
		MyDao<ShoppingCart> dao= (ShoppingCartDaoImpl)contxt.getBean(ShoppingCartDaoImpl.class);
		ShoppingCart cart = contxt.getBean(ShoppingCart.class);
		cart.setCartId(2020);
		cart.setItem("SmartPhone");
		Integer key = (Integer)dao.add(cart);
		System.out.println("One Cart Added Key:" + key);
		contxt.close();
		
	}
}

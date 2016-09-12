package com.training.daos;

import org.hibernate.classic.Session;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.training.entity.Car;
import com.training.ifaces.MyDao;
import com.training.utils.HiberUtils;

public class CarDaoImpl implements MyDao<Car> {

	private SessionFactory factory;


	/**
	 * 
	 */
	public CarDaoImpl() {
		super();
		factory = HiberUtils.getSessionFactory();
	}

	public Car find(Serializable key) {
		// TODO Auto-generated method stub
		
		Session session = factory.openSession();
		Car obtained_car = (Car)session.get(Car.class, key);
	
		return obtained_car;
	}
	public Object add(Car object) {
		String key= null;
		Session session = factory.openSession();
		
		Transaction tx= session.beginTransaction();
		key = (String) session.save(object);
		tx.commit();
		
		return key;
	}
}

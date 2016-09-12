package com.training.apps;
import com.training.daos.CarDaoImpl;
import com.training.domains.Address;
import com.training.entity.Car;

public class Application {

	public static void main(String[] args) {
		CarDaoImpl carDao = new CarDaoImpl();
		//
		Address  resiAddr = new Address("new street", "new City", "2322");
		Address  officeAddr = new Address("old street", "old City", "1212");		
		Car testCar = new Car("2E27", "Sonny", resiAddr, officeAddr);
	
		//String key = (String)carDao.add(testCar);
		//System.out.println(key);
		Car obtainedCar = carDao.find("2E27");
		
		System.out.println(obtainedCar.getRegisterNumber());
		System.out.println(obtainedCar.getOwnerName());
		System.out.println(obtainedCar.getOfficeAddr());
		System.out.println(obtainedCar.getResiAddr());
	}

}

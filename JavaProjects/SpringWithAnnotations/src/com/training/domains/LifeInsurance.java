package com.training.domains;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("insuranceBean")
public class LifeInsurance {
	
	/**
	 * @return the cust
	 */
	public Customer getCust() {
		return cust;
	}
	/**
	 * @param cust the cust to set
	 */
	public void setCust(Customer cust) {
		this.cust = cust;
	}

	//setter dependency injection
	@Value("1212")
	private long policyNumber;
	@Value("50000")
	private double policyAmount;
	
	@Autowired
	//if cust is used then it will take the bean injection from customer
	//if cust1 is used then spring will take the bean injection from xml
	@Qualifier("cust")
	private Customer cust;
	/**
	 * 
	 */
	public LifeInsurance() {
		super();
	}
	/**
	 * @return the policyNumber
	 */
	public long getPolicyNumber() {
		return policyNumber;
	}
	/**
	 * @param policyNumber the policyNumber to set
	 */
	public void setPolicyNumber(long policyNumber) {
		this.policyNumber = policyNumber;
	}
	/**
	 * @return the policyAmount
	 */
	public double getPolicyAmount() {
		return policyAmount;
	}
	/**
	 * @param policyAmount the policyAmount to set
	 */
	public void setPolicyAmount(double policyAmount) {
		this.policyAmount = policyAmount;
	}
	
	public double findFirstPremium(){
		double firstPremium = 0.0;
		double premium = (policyAmount*.01);
		if(premium > 1500.00){
			firstPremium = premium - 500;
		}else{
			firstPremium = premium;
		}
		return firstPremium;
	}
	
	@PostConstruct
	public void init(){
		System.out.println("Resources Created---------");
	}
	
	@PreDestroy
	public void cleanUp(){
		System.out.println("Resources Closed---------");
	}

}

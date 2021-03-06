package com.training.domains;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author stu1
 *
 */
public class CreditCard {
	private long cardNumber;
	private String cardHolder;
	private double creditLimit;
	private double amountSpent;
	private double AmountDue;
	
	
	public double getAmountDue() {
		return AmountDue;
	}

	public void setAmountDue(double amountDue) {
		AmountDue = amountDue;
	}

	public CreditCard(){
		super(); //here object is the super class
	}

	public CreditCard(long cardNumber, String cardHolder, double creditLimit, double amountSpent) {
		super();
		this.cardNumber = cardNumber;
		this.cardHolder = cardHolder;
		this.creditLimit = creditLimit;
		this.amountSpent = amountSpent;
	}
	public CreditCard(long cardNumber){
		this(cardNumber, "Guest", 7500, 7500);
		//this.cardNumber = cardNumber;
	}
	
	public long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardHolder() {
		return cardHolder;
	}

	public void setCardHolder(String cardHolder) {
		
		this.cardHolder = cardHolder;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}

	public double calculateBullAmount(){
		double billAmount = 0.0;
		billAmount = amountSpent*0.05; 
		return billAmount; 
		
	}

	public double getAmountSpent() {
		return amountSpent;
	}

	public void setAmountSpent(double amountSpent) {
		this.amountSpent = amountSpent;
	}
	
	/* DO THIS FOR HOMEWORK
	//assuming that it takes next double
	//input is amount
	//if amount spend is less than 5000 then min amount due is 5% 
	//if amount is more than 50000 then min amount is 7%
	public ArrayList<CreditCard> calculateAmount(long cardNumber, String cardHolder, double creditLimit, double amountSpent){
		Scanner sc = new Scanner(System.in);
		ArrayList<CreditCard> creditCards = new ArrayList<CreditCard>();
		while(true){
			System.out.println("Enter Card Number");
			Long cnum = sc.nextLong();
			System.out.println("Enter Card Holder Name");
			String cholder = sc.next();
			
			
			if(input == -1){
				break;
			}else{
				double multiplyer = 0.05;
				if(input < 5000){
					
				}
				if(input >50000){
					multiplyer = 0.07;
				}
				CreditCard new_credit = new CreditCard(cardNumber, cardHolder, creditLimit, amountSpent);
				new_credit.setAmountDue(new_credit.getAmountSpent()*multiplyer);
				creditCards.add(new_credit);
			}
		}
		return creditCards;
	}
	*/
	
	@Override
	public String toString(){
		return cardNumber+":"+ cardHolder + ":" + creditLimit + ":" + super.toString();
	}
	
}

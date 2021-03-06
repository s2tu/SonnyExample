package com.training.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.training.domains.CurrencyConverter;

public class CurrencyConverterTest {
	private CurrencyConverter conv; 

	@Before
	public void init(){
		conv= new CurrencyConverter();
	}
	@Test
	public void testUsdToINR() {//test negative
		double actual = conv.usdToINR(-100);
		assertEquals(6000, actual, 0);
	}
	@Test
	public void testUsdToINR4() { //test positive
		double actual = conv.usdToINR(100);
		assertEquals(6000, actual, 0);
	}	
	/*
	@Test
	public void testUsdToINR2() {
		CurrencyConverter conv = new CurrencyConverter();
		double actual = conv.usdToINR(6001);
		//assertEqual(6000,actual, 0) produces a failed test
		assertEquals(420070, actual, 0);
	}
	@Test
	public void testUsdToINR3() {
		CurrencyConverter conv = new CurrencyConverter();
		double actual = conv.usdToINR(-100);
		//assertEqual(6000,actual, 0) produces a failed test
		assertEquals(-6000, actual, 0);
	}*/	
}

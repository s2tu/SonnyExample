package tests;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import domains.TaxiOnDutyData;

import managers.TaxiService;


public class CheckTwoOnDutyDataTest {
	TaxiService tservice;
	@Before
	public void init(){
		tservice= new TaxiService();
	}
	
	@Test
	public void oneDutyData() {//positive test
		
		//based on the sql there should be one that is free
		int actual = 1;
		ArrayList<TaxiOnDutyData> data =  tservice.getAvailableCabs();
		int output = data.size();
		assertEquals("oneDutyData Testing:", actual, output);
	}
	
}

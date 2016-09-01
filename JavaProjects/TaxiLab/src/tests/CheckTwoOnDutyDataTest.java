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
	public void obtainDutyData(){//positive test
		
		//based on the sql there should be one that is free
		boolean actual = false;
		ArrayList<TaxiOnDutyData> data =  tservice.getAvailableCabs("Toronto");
		boolean output = data.size() != 0;
		assertEquals("obtainDutyData Testing:", actual, output);
	}
	
}

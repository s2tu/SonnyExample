package tests;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


import domains.TaxiUser;
import managers.TaxiService;


public class ValidateTaxiUserTest {
	
	TaxiService tservice;
	@Before
	public void init(){
		tservice= new TaxiService();
	}
	
	@Test
	public void validUser() {//positive test
		boolean actual = true;
		boolean output = tservice.validate(new TaxiUser("bob@hotmail.com", "password", 911, "Toronto"));
		assertEquals("validUser Testing:", actual, output);
	}
	
	@Test
	public void invalidUser() {//negative test
		boolean actual = false;
		boolean output = tservice.validate(new TaxiUser("bob@hotmail23.com", "password", 911, "Toronto"));
		assertEquals("invalidUser Testing:", actual, output);
	}	
}

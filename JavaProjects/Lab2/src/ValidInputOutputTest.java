import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.domains.BankAccount;

import exceptions.InsufficientBalanceException;
import exceptions.InvalidInputException;

public class ValidInputOutputTest {
	BankAccount dummy;
	@Before
	public void init(){
		 dummy = new BankAccount("Dummy", 23232, 1);
	}
	@Test
	public void testReturnWithdrawDouble() throws InvalidInputException, InsufficientBalanceException{
			assertEquals(dummy.withdraw(1).getClass(), Double.class);
	}
	
	@Test
	public void testReturnDepositDouble() throws InvalidInputException {
			assertEquals(dummy.deposit(1).getClass(), Double.class);		
	}	
	@Test (expected = InvalidInputException.class)
	public void testInputDepositNegative() throws InvalidInputException{
			assertEquals(dummy.deposit(-1).getClass(), Double.class);		
	}
	
	@Test (expected = InsufficientBalanceException.class)
	public void testIssufficentBalance() throws InsufficientBalanceException, InvalidInputException {
			dummy.withdraw(100000);
	}
	@Test
	public void testDeposit() throws InvalidInputException, InsufficientBalanceException{		
			assertEquals(dummy.deposit(1), 2, 0);
		
	}	
	
	
}

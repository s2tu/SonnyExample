import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PerfectNumberTest {

	FindPerfectNumber perfectGen;
	@Before
	public void init(){
		perfectGen = new FindPerfectNumber();
	}
	@Test
	public void testBasic() {
		boolean actual =  perfectGen.checkPerfectNumber(6);
		assertEquals(true,actual);
	}
	@Test
	public void testBigPerfectNumber() {
		boolean actual =  perfectGen.checkPerfectNumber(8128);
		assertEquals(true,actual);
	}
	
	@Test
	public void testZero() {
		boolean actual =  perfectGen.checkPerfectNumber(0);
		assertEquals(true,actual);
	}	
	
	@Test
	public void testOne() {
		boolean actual =  perfectGen.checkPerfectNumber(1);
		assertEquals(false,actual);
	}

	@Test
	public void testThree() {
		boolean actual =  perfectGen.checkPerfectNumber(3);
		assertEquals(false,actual);
	}
	@Test
	public void testnegative() {
		boolean actual =  perfectGen.checkPerfectNumber(-3);
		assertEquals(false,actual);
	}	
}

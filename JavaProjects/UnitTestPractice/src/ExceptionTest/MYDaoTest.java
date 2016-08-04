package ExceptionTest;

import java.sql.Connection;
import org.junit.Test;
import static org.junit.Assert.*;


public class MYDaoTest {
	@Test(expected=java.lang.NullPointerException.class)
	public void testConstructorThrowException(){
		Connection con = null;
		DonorDAO  dao = new DonorDAO(con);
	}
	
}

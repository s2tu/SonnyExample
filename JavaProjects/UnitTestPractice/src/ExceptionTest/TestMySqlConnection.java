package ExceptionTest;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.Test;

public class TestMySqlConnection {

	@Test
	public void testGetMyOracleConnection() {
		Connection con = MySQLConnection.getMyoracleConnection();
		assertNotNull("Check Connection Paramters", con);
	}

}

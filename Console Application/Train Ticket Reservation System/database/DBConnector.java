package railway.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnector implements Server {
	
	private Connection getConnection() {
		
		try {
			Class.forName(DRIVER_CLASS);
			Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			return con;
		} catch (Exception e) {
			System.err.println(e);
		}
		return null;
	}

	public void getJDBCServer() {
		
		try {
			Connection connection = getConnection();
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}
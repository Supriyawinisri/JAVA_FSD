package comm.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnectionFactory {
	
	private static Connection conn = null;
	private static MySqlConnectionFactory connectionFactory = null;
	
	private MySqlConnectionFactory() throws SQLException {
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
	}
	
	public static MySqlConnectionFactory createConnection() throws SQLException{
		if(connectionFactory == null) {
			connectionFactory = new MySqlConnectionFactory();
		}
		return connectionFactory;
	}
	
	public static MySqlConnectionFactory getConnection() throws SQLException{
		
		return connectionFactory;
	}

}

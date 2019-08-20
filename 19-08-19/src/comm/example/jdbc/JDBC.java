package comm.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class JDBC {
	
	private static Properties properties =null;
	
	static {
		properties = new Properties();
		properties.put("JDBC_URL","jdbc:h2:~/mydb");
		properties.put("USER", "sa");
		properties.put("PASSWORD", "sa");
	}
	
	public JDBC() {
		
	}

	public static void main(String[] args) throws ClassNotFoundException , SQLException {
		// TODO Auto-generated method stub
		//Connection conn = DriverManager.getConnection(properties.getProperty("JDBC_URL"),properties.getProperty("USER"),properties.getProperty("PASSWORD"));
		//System.out.println(conn);
		MySqlConnectionFactory factory = MySqlConnectionFactory.createConnection();
		
		//Connection connection = factory.getConnection();
		//PreparedStatement pst = connection.prepareStatement("insert into course values(?,?,?)");
	}
}
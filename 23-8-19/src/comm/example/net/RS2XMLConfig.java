package comm.example.net;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import comm.example.factory.MyConnectionFactory;

public class RS2XMLConfig {
	
	private MyConnectionFactory factory;
	private Connection connection;
	public RS2XMLConfig() throws SQLException {
		super();
		factory = MyConnectionFactory.createObject();
		connection = factory.getConnection();
	}
	
	public ResultSet getAllEmployee() throws SQLException{
		Statement st = connection.createStatement();
		ResultSet rs = st.executeQuery("select id as ID,fname as FirstName,lname as LastName,email as Email from employee");
		return rs;	
	}
	
	public ResultSet getEmployeeById(int id) throws SQLException{
		Statement st = connection.createStatement();
		ResultSet rs = st.executeQuery("select id as ID,fname as FirstName,lname as LastName,email as Email from employee where id="+id);
		return rs;
	}
	

}

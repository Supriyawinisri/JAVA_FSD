package comm.example.factory;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class MyConnectionfactory {
	
	private static DataSource dataSource=null;
	private static Connection connection=null;
	
	public static Connection getMySqlConnectionForDB()
	{
		try {
			
			
			Context initContext = new InitialContext();
			Object o  = initContext.lookup("java:/comp/env/jdbc/mysql");
			dataSource=(javax.sql.DataSource)o;
			
			 connection= dataSource.getConnection();
			
		} catch (NamingException ne) {
			ne.printStackTrace();
			
		} catch (SQLException se) {
			// TODO Auto-generated catch block
			se.printStackTrace();
		}
		return connection;
	}
}
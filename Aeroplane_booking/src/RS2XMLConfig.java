import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import comm.example.factory.MyConnectionFactory;

public class RS2XMLConfig {
	
	private MyConnectionFactory factory;
	private PreparedStatement pStatement;
	private Connection connection;
	public RS2XMLConfig() throws SQLException {
		super();
		factory = MyConnectionFactory.createObject();
		connection = factory.getConnection();
	}
	
	public ResultSet getFlightDetails(int id) throws SQLException{
		Statement st = connection.createStatement();
		ResultSet rs = st.executeQuery("select * from planebooking where id="+id);
		return rs;	
	}
	
	public void updateFlightDetails(int id, int seats) throws SQLException{
		pStatement=connection.prepareStatement("update planebooking set seats=? where id=?");
		pStatement.setInt(2, id);
		pStatement.setInt(1, seats);
		pStatement.executeUpdate();
	}

}

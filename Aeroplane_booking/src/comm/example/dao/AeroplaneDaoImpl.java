package comm.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import comm.example.factory.MyConnectionFactory;
import comm.example.model.Aeroplane;

public class AeroplaneDaoImpl implements AeroplaneDao {
	
	private MyConnectionFactory factory=null;
	private Connection connection=null;
	private PreparedStatement pStatement=null;
	private Statement statement=null;
	private ResultSet resultSet=null;
	
	public AeroplaneDaoImpl() throws SQLException {
		// TODO Auto-generated constructor stub
		super();
		factory=MyConnectionFactory.createObject();
		connection=factory.getConnection();
	}

	@Override
	public void createAeroplane(Aeroplane aeroplane) {
		// TODO Auto-generated method stub
		try {
			pStatement=connection.prepareStatement("insert into planebooking values(?,?,?)");
			pStatement.setInt(1, aeroplane.getPlane_id());
			pStatement.setString(2, aeroplane.getPlane_name());
			pStatement.setInt(3, aeroplane.getSeat_no());
			pStatement.executeUpdate();
			System.out.println("Inserted...");
		} catch (SQLException e) {
			System.out.println("duplicate id");
			e.printStackTrace();
		} finally {
			
		}
		
	}

	@Override
	public List<Aeroplane> getAllAeroplane() {
		// TODO Auto-generated method stub
		List<Aeroplane> list = new ArrayList<Aeroplane>();
		try {
			statement=connection.createStatement();
			resultSet=statement.executeQuery("select * from planebooking");

			while(resultSet.next())
			{
				list.add(new Aeroplane(resultSet.getInt(1), resultSet.getString(2),resultSet.getInt(3)));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return list;
	}

}

package comm.example.dao;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import comm.example.factory.MyConnectionfactory;
import comm.example.model.User;

public class UserDetailsImpl implements UserDetails {
	Connection connection=MyConnectionfactory.getMySqlConnectionForDB();
	@Override
	public void addUserDetails(String name, String password, String email, String country) {
		// TODO Auto-generated method stub
		List<User> list = new ArrayList<User>();
		list.add(new User(name,password,email,country));
		
		try {
			PreparedStatement pst=connection.prepareStatement("insert into user_details(name,password,email,country,uid) values(?,?,?,?,?)");
			pst.setString(1, name);
			pst.setString(2, password);
			pst.setString(3, email);
			pst.setString(4, country);
			pst.setInt(5,User.serialVersionUID++);
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<String> viewUserDetails(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<User> edit(int id) throws SQLException {
		List<User> list=new ArrayList<User>();
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery("select * from user_details where id="+id);
		while(rs.next()) {
			list.add(new User(rs.getString("name"),rs.getString("password"),rs.getString("email"),rs.getString("country")));
		}
		return list;
	}

	@Override
	public void update(int id, String name, String password, String email, String country) throws SQLException {
		PreparedStatement pst = connection.prepareStatement("update user_details set name=?,password=?,email=?,country=? where id=?");
		pst.setString(1, name);
		pst.setString(2, password);
		pst.setString(3, email);
		pst.setString(4, country);
		pst.setInt(5, id);
		pst.executeUpdate();
	}

	@Override
	public void delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println(id);
		PreparedStatement pst = connection.prepareStatement("delete from user_details where id=?");
		pst.setInt(1, id);
		pst.executeUpdate();
	}

}

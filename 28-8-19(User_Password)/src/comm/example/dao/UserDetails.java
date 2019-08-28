package comm.example.dao;

import java.sql.SQLException;
import java.util.List;

import comm.example.model.User;

public interface UserDetails {
	
	public void addUserDetails(String name, String password, String email, String country);
	public List<String> viewUserDetails(int id);
	public List<User> edit(int id) throws SQLException;
	public void update(int id, String name, String password, String email, String country) throws SQLException;
	public void delete(int id) throws SQLException;
}

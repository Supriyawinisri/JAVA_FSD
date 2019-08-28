package comm.example.model;

import java.io.Serializable;

public class User implements Serializable {
	
	public static int serialVersionUID = 65479;
	
	private String user_name, password, email, country;

	public User(String user_name, String password, String email, String country) {
		super();
		this.user_name = user_name;
		this.password = password;
		this.email = email;
		this.country = country;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}

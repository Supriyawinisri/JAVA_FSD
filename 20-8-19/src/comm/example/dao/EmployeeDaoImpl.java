package comm.example.dao;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import comm.example.factory.MyConnectionFactory;
import comm.example.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	private MyConnectionFactory factory=null;
	private Connection connection=null;
	private PreparedStatement pStatement=null;
	private Statement statement=null;
	private ResultSet resultSet=null;
	

	public EmployeeDaoImpl() throws SQLException {
		super();
		factory=MyConnectionFactory.createObject();
		connection=factory.getConnection();
	}

	

	@Override
	public List<Employee> getAllEmployees() 
	{
		List<Employee> list=new ArrayList<Employee>();
		try {
			statement=connection.createStatement();
			resultSet=statement.executeQuery("select * from employee");
			ResultSetMetaData rMetaData = resultSet.getMetaData();
			//no of column in the table 
			System.out.println(rMetaData.getColumnCount());
			//name of the column
			System.out.println(rMetaData.getColumnLabel(1));
			System.out.println(rMetaData.getColumnLabel(2));
			System.out.println(rMetaData.getColumnLabel(3));

			while(resultSet.next())
			{
				list.add(new Employee(resultSet.getInt(1), resultSet.getString(2),
						resultSet.getString(3), resultSet.getString(4)));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeEmployee(int id) {
		// TODO Auto-generated method stub
		try {
			pStatement=connection.prepareStatement("delete from employee where id="+id);
			pStatement.executeUpdate();
			
			
		} catch (SQLException e) {
			System.out.println("ID doesnot exist...");
			
			e.printStackTrace();
		} finally {
			
		}
	}

	@Override
	public void createEmployee(Employee employee) {
		try {
			pStatement=connection.prepareStatement("insert into employee values(?,?,?,?)");
			pStatement.setInt(1, employee.getId());
			pStatement.setString(2, employee.getFirstName());
			pStatement.setString(3, employee.getLastName());
			pStatement.setString(4, employee.getEmail());
			pStatement.executeUpdate();
			
			
		} catch (SQLException e) {
			System.out.println("duplicate id");
			
			e.printStackTrace();
		} finally {
			
		}				
	}
	
	@Override
	public void getConnectionInfo() {
		try {
			DatabaseMetaData dMetaData = connection.getMetaData();
			//About the connection and database
			System.out.println(dMetaData.getDatabaseProductName());
			System.out.println(dMetaData.getDatabaseProductVersion());
			System.out.println(dMetaData.getDriverName());
			System.out.println(dMetaData.getDriverMajorVersion()+" "+dMetaData.getDriverMinorVersion());
			System.out.println(dMetaData.getURL());
			System.out.println(dMetaData.getUserName());
		}catch(Exception e) {
			
		}
	}

	@Override
	public void modifyEmployeeFName(int id, String fName) {
		// TODO Auto-generated method stub
		try {
			pStatement=connection.prepareStatement("update employee set fname=? where id=?");
			pStatement.setInt(2, id);
			pStatement.setString(1, fName);
			pStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void modifyEmployeeLName(int id, String lName) {
		// TODO Auto-generated method stub
		try {
			pStatement=connection.prepareStatement("update employee set lname=? where id=?");
			pStatement.setInt(2, id);
			pStatement.setString(1, lName);
			pStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void modifyEmployeeEmail(int id, String Email) {
		// TODO Auto-generated method stub
		try {
			pStatement=connection.prepareStatement("update employee set email=? where id=?");
			pStatement.setInt(2, id);
			pStatement.setString(1, Email);
			pStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}

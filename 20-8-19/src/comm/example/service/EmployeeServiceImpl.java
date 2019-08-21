package comm.example.service;

import java.sql.SQLException;
import java.util.List;

import comm.example.dao.EmployeeDao;
import comm.example.dao.EmployeeDaoImpl;
import comm.example.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao dao = null;

	public EmployeeServiceImpl() throws SQLException {
		super();
		dao = new EmployeeDaoImpl();
	}

	@Override
	public void createEmployee(Employee employee) {

		dao.createEmployee(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {

		return dao.getAllEmployees();
	}

	@Override
	public Employee getEmployeeById(int id) {

		return null;
	}

	@Override
	public void removeEmployee(int id) {
		// TODO Auto-generated method stub
		dao.removeEmployee(id);
	}
	
	@Override
	public void getConnectionInfo() {
		dao.getConnectionInfo();
	}

	@Override
	public void modifyEmployeeFName(int id, String fName) {
		// TODO Auto-generated method stub
		dao.modifyEmployeeFName(id, fName);
	}

	@Override
	public void modifyEmployeeLName(int id, String lName) {
		// TODO Auto-generated method stub
		dao.modifyEmployeeLName(id, lName);
	}

	@Override
	public void modifyEmployeeEmail(int id, String Email) {
		// TODO Auto-generated method stub
		dao.modifyEmployeeEmail(id, Email);
	}

}
package comm.example.service;


import java.util.List;

import comm.example.model.Employee;

public interface EmployeeService {
	public void createEmployee(Employee employee);
	public List<Employee> getAllEmployees();
	public Employee getEmployeeById(int id);
	public void removeEmployee(int id);	
	public void modifyEmployeeFName(int id,String fName);
	public void modifyEmployeeLName(int id,String lName);
	public void modifyEmployeeEmail(int id,String Email);
	public void getConnectionInfo();
}
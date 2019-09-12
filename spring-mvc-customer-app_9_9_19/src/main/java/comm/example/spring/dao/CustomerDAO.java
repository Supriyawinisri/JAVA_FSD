package comm.example.spring.dao;

import java.util.List;

import comm.example.spring.entity.Customer;

public interface CustomerDAO {
	
	public void createCustomer(Customer theCustomer);
	public List<Customer> getCustomers();
	public void saveCustomer(Customer theCustomer);
	public void deleteCustomers(int id);

}

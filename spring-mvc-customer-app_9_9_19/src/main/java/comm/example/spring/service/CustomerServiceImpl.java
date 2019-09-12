package comm.example.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import comm.example.spring.dao.CustomerDAO;
import comm.example.spring.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO dao;
	public void createCustomer(Customer theCustomer) {
		dao.createCustomer(theCustomer);

	}
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		return dao.getCustomers();
	}

	@Override
	@Transactional
	public void saveCustomer(Customer theCustomer) {

		dao.saveCustomer(theCustomer);
	}

	@Override
	@Transactional
	public void deleteCustomers(int id) {
		// TODO Auto-generated method stub
		dao.deleteCustomers(id);
	}

}
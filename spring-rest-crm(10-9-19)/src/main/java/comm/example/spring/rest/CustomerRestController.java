package comm.example.spring.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import comm.example.spring.rest.Customer;

@RestController
@RequestMapping("/api")
public class CustomerRestController {

	@Autowired
	private CustomerService service;
	
	@GetMapping("/customers")
	public List<Customer> getAllCustomers()
	{
		return service.getAllCustomer();
	}
}

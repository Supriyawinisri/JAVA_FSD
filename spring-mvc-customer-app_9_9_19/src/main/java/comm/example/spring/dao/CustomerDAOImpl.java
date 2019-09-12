package comm.example.spring.dao;

import java.util.List;

import javax.annotation.PostConstruct;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import comm.example.spring.entity.Customer;

@Repository

public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private SessionFactory sessionFactory;
	private Session session;
	
	public CustomerDAOImpl() {
		super();
	}
	
	@PostConstruct
	public void createSession()
	{
		session=sessionFactory.openSession();
	}
	

	public CustomerDAOImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}


	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}


	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	@Override
	public void createCustomer(Customer theCustomer) {
		
		session.saveOrUpdate(theCustomer);
	}
	
	@Override
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Customer> theQuery = currentSession.createQuery("from Customer order by lname", Customer.class);
		List<Customer> customers = theQuery.getResultList();
		return customers;

	}
	
	@Override
	public void saveCustomer(Customer theCustomer) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.save(theCustomer);

	}
	
	@Override
	public void deleteCustomers(int id) {
		// TODO Auto-generated method stub
		Customer customer = (Customer) sessionFactory.getCurrentSession().load(Customer.class, id);
            this.sessionFactory.getCurrentSession().delete(customer);
	}

}
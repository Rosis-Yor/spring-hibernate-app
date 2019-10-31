package coolschool.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import coolschool.springdemo.dao.CustomerDAO;
import coolschool.springdemo.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	
	// need to inject customer DAO
	@Autowired
	public CustomerDAO customerDAO;
	
	@Override
	@Transactional
	public List<Customer> getCustomer() {

		
		return customerDAO.getCustomers();
	}

	@Override
	@Transactional
	public void saveCustomer(Customer theCustomer) {

		customerDAO.saveCustomer(theCustomer);
	}

	@Override
	@Transactional
	public Customer getCustomer(int theId) {
		return customerDAO.getCustomer(theId);
	}

	@Override
	@Transactional
	public void deleteCustomer(int theId) {

		customerDAO.deleteCustomer(theId) ;
	}

	@Override
	@Transactional
	public List<Customer> searchCustomers(String theSearchName) {

		return customerDAO.searchCustomers(theSearchName);
	}

}

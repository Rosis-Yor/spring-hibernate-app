package coolschool.springdemo.service;

import java.util.List;

import coolschool.springdemo.entity.Customer;

public interface CustomerService {

	public List<Customer>  getCustomer() ;

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);

	public List<Customer> searchCustomers(String theSearchName);
}

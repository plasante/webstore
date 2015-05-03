package com.uniksoft.webstore.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uniksoft.webstore.entity.Customer;

@Repository
public class InMemoryCustomerRepository implements CustomerRepository {

	private List<Customer> customers = new ArrayList<Customer>();
	
	public InMemoryCustomerRepository() {
		Customer customer1 = new Customer();
		customer1.setCustomerId(1);
		customer1.setName("Pierre");
		customer1.setAddress("addresse");
		customer1.setNoOfOrdersMade(5);
		customers.add(customer1);
	}
	
	@Override
	public List<Customer> getAllCustomers() {
		return customers;
	}

}

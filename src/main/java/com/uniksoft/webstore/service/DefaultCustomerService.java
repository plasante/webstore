package com.uniksoft.webstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uniksoft.webstore.entity.Customer;
import com.uniksoft.webstore.repository.CustomerRepository;

@Service
public class DefaultCustomerService implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public List<Customer> getAllCustomers() {
		return customerRepository.getAllCustomers();
	}

}

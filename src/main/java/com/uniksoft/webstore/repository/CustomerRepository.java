package com.uniksoft.webstore.repository;

import java.util.List;
import com.uniksoft.webstore.entity.Customer;

public interface CustomerRepository {
	List<Customer> getAllCustomers();
}

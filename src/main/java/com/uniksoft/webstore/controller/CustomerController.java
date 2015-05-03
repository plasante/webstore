package com.uniksoft.webstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uniksoft.webstore.service.CustomerService;

// Spring's autodetection mechanism for auto-registering the bean definition
@Controller
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@RequestMapping("/customers")
	public String getAllCustomers(Model model) {
		model.addAttribute("customers", customerService.getAllCustomers());
		return "customers";
	}
}

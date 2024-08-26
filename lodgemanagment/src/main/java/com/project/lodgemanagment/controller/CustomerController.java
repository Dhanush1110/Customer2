package com.project.lodgemanagment.controller;


import com.project.lodgemanagment.customerentity.Customer;
import com.project.lodgemanagment.customerrepository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.*;
	@RestController
	@RequestMapping("/api/customers")
	public class CustomerController {
	    @Autowired
	    private CustomerRepository customerRepository;

	    @PostMapping
	    public Customer createUser(@RequestBody Customer customer) {
	        return customerRepository.save(customer);
	    }
	}



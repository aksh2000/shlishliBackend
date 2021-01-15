package com.shlishli.customer.service;

import com.shlishli.customer.entity.Customer;
import com.shlishli.customer.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CustomerService {
    

    @Autowired
    CustomerRepository customerRepository;

	public Customer registerCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	public Customer findCustomerById(Long id) {
		return customerRepository.findById(id).get();
	}

    
}

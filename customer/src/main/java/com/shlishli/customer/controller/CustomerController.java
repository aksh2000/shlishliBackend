package com.shlishli.customer.controller;


import com.shlishli.customer.entity.Customer;
import com.shlishli.customer.service.CustomerService;
import com.shlishli.customer.utilities.IConstants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(IConstants.CUSTOMERS)
public class CustomerController {
    
    @Autowired
    CustomerService customerService;


    @PostMapping(IConstants.ADD_CUSTOMER)
    public Customer registerCustomer(@RequestBody Customer customer){
        return customerService.registerCustomer(customer);
    }


    @GetMapping(IConstants.GET_CUSTOMER_DETAILS)
    public Customer findCustomerById(@PathVariable("customerId") Long customerId){
        return customerService.findCustomerById(customerId);    
    }

    @GetMapping(value = "getCustomerDetailsByFirebaseUserId/{firebaseUserId}")
    public Customer getCustomerDetailsByFirebaseUserId(@PathVariable("firebaseUserId") String firebaseUserId){
        return customerService.getCustomerDetailsByFirebaseUserId(firebaseUserId);
    }


}

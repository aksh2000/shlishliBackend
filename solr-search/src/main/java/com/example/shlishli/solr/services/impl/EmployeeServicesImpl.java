package com.example.shlishli.solr.services.impl;

import com.example.shlishli.solr.entity.Product;
import com.example.shlishli.solr.repository.EmployeeRepository;
import com.example.shlishli.solr.services.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServicesImpl implements EmployeeServices {


    @Autowired
    EmployeeRepository employeeRepository;


    @Override
    public Product save(Product product) {
        return employeeRepository.save(product);
    }

    @Override
    public List<Product> findAll() {
        Iterable<Product> employeeIterable=employeeRepository.findAll();
        List<Product> productList =new ArrayList<>();
        employeeIterable.forEach(productList::add);
        return productList;
    }

    @Override
    public List<Product> findByCustomName(String name) {
        return employeeRepository.findByCustomQuery(name);
    }
}

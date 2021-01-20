package com.example.shlishli.solr.services;

import com.example.shlishli.solr.entity.Product;

import java.util.List;

public interface EmployeeServices {

    public Product save(Product product);

    public List<Product> findAll();

    List<Product> findByCustomName(String name);
}
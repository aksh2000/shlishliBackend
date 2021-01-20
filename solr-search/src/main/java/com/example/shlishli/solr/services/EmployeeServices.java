package com.example.shlishli.solr.services;

import com.example.shlishli.solr.entity.Employee;

import java.util.List;

public interface EmployeeServices {

    public Employee save(Employee employee);

    public List<Employee> findAll();

    List<Employee> findByCustomName(String name);
}
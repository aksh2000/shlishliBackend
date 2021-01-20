package com.example.shlishli.solr.controller;

import com.example.shlishli.solr.entity.Product;
import com.example.shlishli.solr.services.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/solr")
public class EmployeeController {

    @Autowired
    EmployeeServices employeeServices;

    @PostMapping("/save")
    Product save(@RequestBody Product product)
    {
        return employeeServices.save(product);
    }

    @GetMapping(value="/findByName/{firstName}")
    List<Product> findByName(@PathVariable("firstName") String firstName)
    {
        return employeeServices.findByCustomName(firstName);
    }

    @GetMapping(value ="/findAll")
    List<Product> findAll()
    {
        return employeeServices.findAll();
    }

}
package com.example.shlishli.solr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/solr")
public class EmployeeController {

    @Autowired
    EmployeeServices employeeServices;

    @PostMapping("/save")
    Employee save(@RequestBody Employee employee)
    {
        return employeeServices.save(employee);
    }

    @GetMapping(value="/findByName/{firstName}")
    List<Employee> findByName(@PathVariable("firstName") String firstName)
    {
        return employeeServices.findByCustomName(firstName);
    }

    @GetMapping(value ="/findAll")
    List<Employee> findAll()
    {
        return employeeServices.findAll();
    }

}
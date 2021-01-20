package com.example.shlishli.solr.repository;

import com.example.shlishli.solr.entity.Employee;
import org.springframework.data.solr.repository.Query;
import org.springframework.data.solr.repository.SolrCrudRepository;

import java.util.List;

public interface EmployeeRepository extends SolrCrudRepository<Employee,String> {

    @Query("name:*?0* OR title:*?0*")
    public List<Employee> findByCustomQuery(String searchTerm);

}

package com.example.shlishli.solr.repository;

import com.example.shlishli.solr.entity.Product;
import org.springframework.data.solr.repository.Query;
import org.springframework.data.solr.repository.SolrCrudRepository;

import java.util.List;

public interface EmployeeRepository extends SolrCrudRepository<Product,String> {

    @Query("productName:*?0* OR color:*?0*")
    public List<Product> findByCustomQuery(String searchTerm);

}

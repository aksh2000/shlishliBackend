package com.shlishli.customer.repository;

import com.shlishli.customer.entity.Customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

    Customer findByFirebaseCustomerId(String firebaseUserId);
}

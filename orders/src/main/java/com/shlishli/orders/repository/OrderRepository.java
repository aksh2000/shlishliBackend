package com.shlishli.orders.repository;

import com.shlishli.orders.entity.Order;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrderRepository extends CrudRepository<Order,Long> {
    List<Order> findByCustomerId(Long customerId);
}

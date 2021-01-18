package com.shlishli.orders.service;

import com.shlishli.orders.entity.Order;
import com.shlishli.orders.repository.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;

	public Order add(Order order) {
		return orderRepository.save(order);
	}

	public Order findOrderById(Long id) {
        return orderRepository.findById(id).get();
	}

	public List<Order> getOrderDetailsByCustomerId(Long customerId) {
		return orderRepository.findByCustomerId(customerId);
	}
}

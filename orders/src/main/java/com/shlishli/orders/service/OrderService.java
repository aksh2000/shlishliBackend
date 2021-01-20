package com.shlishli.orders.service;

import com.shlishli.orders.entity.Inventory;
import com.shlishli.orders.entity.Order;
import com.shlishli.orders.repository.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

	@Autowired
	RestTemplate restTemplate;

    @Autowired
    OrderRepository orderRepository;

	public Order add(Order order) {
		updateInventory(order.getInventoryId(), order.getQuantity());
		return orderRepository.save(order);
	}

	public Order findOrderById(Long id) {
        return orderRepository.findById(id).get();
	}

	public List<Order> getOrderDetailsByCustomerId(Long customerId) {
		return orderRepository.findByCustomerId(customerId);
	}


	public List<Order> findByInventoryId(Long inventoryId) {
		return orderRepository.findByInventoryId(inventoryId);
	}

	public void updateInventory(Long inventoryId, Integer quantity){
			Inventory inventory = restTemplate.getForObject("http://INVENTORY-SERVICE/inventories/getInventoryDetails/"+inventoryId, Inventory.class);
		quantity = inventory.getQuantity()-quantity;
		inventory = restTemplate.getForObject("http://INVENTORY-SERVICE/inventories/updateQuantityOfItem/"+inventoryId+"/"+quantity, Inventory.class);
		System.out.println("Inventory Updated "+inventory.getQuantity());
	}
}

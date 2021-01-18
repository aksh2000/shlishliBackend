package com.shlishli.orders.controller;

import com.shlishli.orders.entity.Order;
import com.shlishli.orders.service.OrderService;
import com.shlishli.orders.utilities.IConstants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(value = IConstants.ORDERS)
public class OrderController {
    
    @Autowired
    OrderService orderService;
    
    @PostMapping(value = IConstants.ADD_ORDER)
    Order add(@RequestBody Order order)
    {
        return orderService.add(order);
    }

    
    @GetMapping(value = IConstants.GET_ORDER_DETAILS)
    Order getOrderDetails(@PathVariable("orderId") Long id)
    {
        return orderService.findOrderById(id);
    }
}
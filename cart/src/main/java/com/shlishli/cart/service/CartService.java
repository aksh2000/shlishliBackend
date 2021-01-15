package com.shlishli.cart.service;

import java.util.List;

import com.shlishli.cart.entity.CartItem;
import com.shlishli.cart.repository.CartRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {

    @Autowired
    CartRepository cartRepository;

	public List<CartItem> getItems(Long customerId) {
		return cartRepository.findByCustomerId(customerId);
    
	}

	public void updateQuantity(Long cartId, Integer quantity) {
        cartRepository.updateQuantity(cartId, quantity);
	}

	public void deleteItem(Long cartId) {
        cartRepository.deleteById(cartId);
	}

	public CartItem addItem(CartItem cartItem) {
		return cartRepository.save(cartItem);
	}
    
}

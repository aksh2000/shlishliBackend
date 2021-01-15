package com.shlishli.cart.controller;

import java.util.List;

import javax.ws.rs.DELETE;

import com.shlishli.cart.entity.CartItem;
import com.shlishli.cart.service.CartService;
import com.shlishli.cart.utilities.IConstants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = IConstants.CART)
public class CartController {
    
    
    @Autowired
    CartService cartService;


    @GetMapping(value = IConstants.GET_CART_ITEM_DETAILS)
    public List<CartItem> getCartItems(@PathVariable("customerId") Long customerId){
        return cartService.getItems(customerId);
    }
    @PostMapping(value = IConstants.ADD_TO_CART)
    public CartItem addItem(@RequestBody CartItem cartItem){
        return cartService.addItem(cartItem);
    }
    @PostMapping(value = IConstants.UPDATE_QUANTITY)
    public String updateQuantityOfItem(@RequestParam("cartId") Long cartId, @RequestParam("quantity") Integer quantity){
        cartService.updateQuantity(cartId, quantity);
        return "Updated Successfully";
    }
    
    @DeleteMapping(value = IConstants.DELETE_CART_ITEM)
    public String deleteItem(@PathVariable("cartId") Long cartId){
        cartService.deleteItem(cartId);
        return "deleted Successfully";
    }  
}

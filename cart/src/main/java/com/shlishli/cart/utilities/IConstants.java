package com.shlishli.cart.utilities;

public interface IConstants {
    String CART = "/carts";
    String ADD_TO_CART = "/add";
    String GET_CART_ITEM_DETAILS = "/getCartItems/{customerId}";
    String CART_TABLE = "cart";
    String UPDATE_QUANTITY = "/updateQuantity";
    String DELETE_CART_ITEM = "/delete/{cartId}";  
}

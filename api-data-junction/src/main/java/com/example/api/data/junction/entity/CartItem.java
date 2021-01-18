package com.example.api.data.junction.entity;

import lombok.Data;


public class CartItem {

    private Long cartId;

    private Long customerId;
    private Long productId;
    private Long merchantId;
    private Integer quantity;
    private Double price;

    public CartItem() {
    }

    public CartItem(Long cartId, Long customerId, Long productId, Long merchantId, Integer quantity, Double price) {

        this.cartId = cartId;
        this.customerId = customerId;
        this.productId = productId;
        this.merchantId = merchantId;
        this.quantity = quantity;
        this.price = price;
    }

    public Long getCartId() {

        return cartId;
    }

    public void setCartId(Long cartId) {
        this.cartId = cartId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}

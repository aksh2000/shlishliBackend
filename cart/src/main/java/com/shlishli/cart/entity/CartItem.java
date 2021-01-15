package com.shlishli.cart.entity;

import javax.persistence.*;

import com.shlishli.cart.utilities.IConstants;

@Entity
@Table(name=IConstants.CART_TABLE)
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cartId;

    private Long customerId;
    private Long productId;
    private Long merchantId;
    private Integer quantity;
    private Double price;


    public Long getCartId() {
        return cartId;
    }

    public Long getCustomerId() {
        return customerId;
    }
    public Long getMerchantId() {
        return merchantId;
    }
    public Double getPrice() {
        return price;
    }
    public Long getProductId() {
        return productId;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public void setCartId(Long cartId) {
        this.cartId = cartId;
    }
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public void setProductId(Long productId) {
        this.productId = productId;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
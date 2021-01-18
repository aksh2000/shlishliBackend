package com.example.api.data.junction.entity;

public class Inventory {

    private Long inventoryItemId;
    private Long productId;
    private Long merchantId;
    private Integer price;
    private Integer quantity;

    public Inventory(Long inventoryItemId, Long productId, Long merchantId, Integer price, Integer quantity) {
        this.inventoryItemId = inventoryItemId;
        this.productId = productId;
        this.merchantId = merchantId;
        this.price = price;
        this.quantity = quantity;
    }

    public Inventory() {
    }

    public Long getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(Long inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}

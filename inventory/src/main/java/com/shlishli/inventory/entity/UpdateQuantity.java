package com.shlishli.inventory.entity;


public class UpdateQuantity {
    private Long productId;
    private Long merchantId;
    private Integer quantity;

    public Long getMerchantId() {
        return merchantId;
    }

    public Long getProductId() {
        return productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }
    public void setProductId(Long productId) {
        this.productId = productId;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}



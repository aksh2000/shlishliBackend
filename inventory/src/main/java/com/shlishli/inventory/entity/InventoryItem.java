package com.shlishli.inventory.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.shlishli.inventory.utilities.IConstants;


@Entity
@Table(name = IConstants.INVENTORY_TABLE)
public class InventoryItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long inventoryItemId;
    private Long productId;
    private Long merchantId;
    private Integer price;
    private Integer quantity;

    public void setInventoryItemId(Long inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
    public void setProductId(Long productId) {
        this.productId = productId;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public Long getInventoryItemId() {
        return inventoryItemId;
    }
    public Long getMerchantId() {
        return merchantId;
    }
    public Integer getPrice() {
        return price;
    }
    public Long getProductId() {
        return productId;
    }
    public Integer getQuantity() {
        return quantity;
    }
    
}

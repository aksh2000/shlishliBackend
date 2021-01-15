package com.shlishli.product.entity;

import javax.persistence.*;

@Entity
@Table(name="products")
public class Product {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productId;

    private Long categoryId;
    private String productName;
    private String description;
    private String imageUrl;
    private String size;
    private String color;
    private boolean isTopProduct;
    private String usp;


    public String getUsp() {
        return usp;
    }
    public void setUsp(String usp) {
        this.usp = usp;
    }
    public Long getProductId() {
        return productId;
    }
    public void setProductId(Long productId) {
        this.productId = productId;
    }
    public Long getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isTopProduct() {
        return isTopProduct;
    }
    public void setTopProduct(boolean topProduct) {
        isTopProduct = topProduct;
    }
}

package com.example.api.data.junction.entity;

public class Category {
    private Long categoryId;

    private String name;
    private String imageUrl;

    public Category(Long categoryId, String name, String imageUrl) {
        this.categoryId = categoryId;
        this.name = name;
        this.imageUrl = imageUrl;
    }

    public Category() {
    }

    public Long getCategoryId() {

        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}

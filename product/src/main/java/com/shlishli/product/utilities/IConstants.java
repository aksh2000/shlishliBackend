package com.shlishli.product.utilities;

public interface IConstants {
    
    String PRODUCTS = "/products";
    String ADD_PRODUCT = "/add";
    String DELETE_PRODUCT = "/delete/{productId}";
    String GET_PRODUCT_DETAILS = "/getProductDetails/{productId}";
    String GET_PRODUCTS_OF_A_CATEGORY = "/getProducts/{categoryId}";
    String GET_ALL_PRODUCTS = "/getAllProducts";
    String PRODUCT_TABLE = "products";
}

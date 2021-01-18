package com.shlishli.product.controller;

import java.util.List;

import com.shlishli.product.entity.Product;
import com.shlishli.product.service.ProductService;
import com.shlishli.product.utilities.IConstants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(IConstants.PRODUCTS)
public class ProductController {
    
    @Autowired
    private ProductService productService;

    @PostMapping(IConstants.ADD_PRODUCT)                                //This method will add a product to the database
    public Product addProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }

    @GetMapping(value = IConstants.GET_PRODUCT_DETAILS)        //This method will return product details on getting product id as parameters
    public Product findProductById(@PathVariable("productId") Long productId){
        return productService.findProductById(productId);
    }

    @DeleteMapping(value = IConstants.DELETE_PRODUCT)      //This method will delete product with specific id
    public void deleteProductById(@PathVariable("productId") Long productId){
        productService.findProductById(productId);
    }
    @GetMapping(value = IConstants.GET_ALL_PRODUCTS)      //This method will display list of all products
    public List<Product> getAllProducts(){
        return productService.getProducts();
    }

    @GetMapping(value = IConstants.GET_PRODUCTS_OF_A_CATEGORY)     //This method will take categoryId and return all products in that category
    public List<Product> getAllProductsInASpecificCategory(@PathVariable("categoryId") Long categoryId){
        return productService.getAllProductsInASpecificCategory(categoryId);
    }

    @GetMapping(value = "/getTopProducts")
    public List<Product> getTopProducts(){
        return productService.getTopProducts();
    }
}

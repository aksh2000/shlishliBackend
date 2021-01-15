package com.shlishli.product.service;

import java.util.ArrayList;
import java.util.List;

import com.shlishli.product.entity.Product;
import com.shlishli.product.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}

	public Product findProductById(Long productId) {
        return productRepository.findByProductId(productId);
	}

	public List<Product> getProducts() {
		Iterable<Product> productIterable = productRepository.findAll();
        List<Product> productList = new ArrayList<>();
        productIterable.forEach(productList::add);
        return productList;
	}

	public List<Product> getAllProductsInASpecificCategory(Long categoryId) {
		return productRepository.findByCategoryId(categoryId);
	}
    
}

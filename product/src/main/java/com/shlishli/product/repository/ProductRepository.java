package com.shlishli.product.repository;

import java.util.List;

import com.shlishli.product.entity.Product;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.*;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
    Product findByProductId(Long productId);
    List<Product> findByCategoryId(Long categoryId);

    @Query("SELECT p FROM Product p where p.isTopProduct = true")
    List<Product> findTopProducts();
}
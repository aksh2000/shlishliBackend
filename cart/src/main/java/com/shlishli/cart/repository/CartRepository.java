package com.shlishli.cart.repository;

import java.util.List;

import javax.transaction.Transactional;

import com.shlishli.cart.entity.CartItem;

import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.*;

@Repository
public interface CartRepository extends CrudRepository<CartItem, Long> {
    List<CartItem> findByCustomerId(Long customerId);


    // update quantity of products added in cart
    @Modifying
    @Transactional
    @Query(value = "update cart set quantity=?2  where cart_id=?1", nativeQuery = true)
    void updateQuantity(Long cartId, Integer quantity);
}

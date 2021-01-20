package com.shlishli.inventory.repository;

import java.util.List;

import javax.transaction.Transactional;

import com.shlishli.inventory.entity.InventoryItem;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository extends CrudRepository<InventoryItem, Long>{
    List<InventoryItem> findByProductId(Long productId);
    List<InventoryItem> findByMerchantId(Long merchantId);


    /*
    *  Function to update quantity of Inventory Item
    */
    @Modifying
    @Transactional
    @Query(value = "update inventory set quantity=?2  where inventory_item_id=?1", nativeQuery = true)
    void updateQuantity(Long inventoryId, Integer quantity);



    InventoryItem findFirstByProductIdOrderByPrice(Long productId);
}

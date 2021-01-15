package com.shlishli.inventory.service;

import java.util.List;

import com.shlishli.inventory.entity.InventoryItem;
import com.shlishli.inventory.entity.UpdateQuantity;
import com.shlishli.inventory.repository.InventoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {

    @Autowired
    InventoryRepository inventoryRepository;

	public InventoryItem saveInventoryItem(InventoryItem inventoryItem) {
		return inventoryRepository.save(inventoryItem);
	}

	public List<InventoryItem> getInventoryItemsByProductId(Long productId) {
		return inventoryRepository.findByProductId(productId);
	}

	public List<InventoryItem> getInventoryItemsByMerchantId(Long merchantId) {
		return inventoryRepository.findByMerchantId(merchantId);
	}

	public void deleteInventoryItem(Long inventoryItemId) {
        inventoryRepository.deleteById(inventoryItemId);
	}

	public void updateQuantity(UpdateQuantity updateQuantity) {
        inventoryRepository.updateQuantity(updateQuantity.getProductId(), updateQuantity.getMerchantId(), updateQuantity.getQuantity());
    
	}
    
}

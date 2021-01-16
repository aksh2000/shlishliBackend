package com.shlishli.inventory.controller;

import java.util.List;

import com.shlishli.inventory.entity.InventoryItem;
import com.shlishli.inventory.entity.UpdateQuantity;
import com.shlishli.inventory.service.InventoryService;
import com.shlishli.inventory.utilities.IConstants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = IConstants.INVENTORY)
public class InventoryController {
    
    @Autowired
    InventoryService inventoryService;
    
    
    @PostMapping(value = IConstants.ADD_INVENTORY_ITEM)
    InventoryItem addInventoryItem(@RequestBody InventoryItem inventoryItem){
        return inventoryService.saveInventoryItem(inventoryItem);
    }

    @GetMapping(value = IConstants.GET_INVENTORY_ITEMS_BY_PRODUCT_ID)
    List<InventoryItem> getInventoryItemsByProductId(@PathVariable("productId") Long productId){
        return inventoryService.getInventoryItemsByProductId(productId);
    }

    @GetMapping(value = IConstants.GET_INVENTORY_ITEMS_BY_MERCHANT_ID)
    List<InventoryItem> getInventoryItemsByMerchantId(@PathVariable("merchantId") Long merchantId){
        return inventoryService.getInventoryItemsByMerchantId(merchantId);
    }

    @DeleteMapping(value = IConstants.DELETE_INVENTORY_ITEM)
    String deleteInventoryItem(@PathVariable("inventoryItemId") Long inventoryItemId){
        inventoryService.deleteInventoryItem(inventoryItemId);
        return "Delete Successfully";
    }

    
    @PutMapping(value = IConstants.UPDATE_INVENTORY_ITEM)
    InventoryItem updateInventoryItem(@RequestBody InventoryItem inventoryItem){
        return inventoryService.saveInventoryItem(inventoryItem);
    }
    @PutMapping(value = IConstants.UPDATE_INVENTORY_ITEM_QUANTITY)
    String updateQuantityOfInventory(@RequestBody UpdateQuantity updateQuantity){
        inventoryService.updateQuantity(updateQuantity);
        return "Updated sucessfully";
    }
}

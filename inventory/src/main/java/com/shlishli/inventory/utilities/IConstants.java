package com.shlishli.inventory.utilities;

public interface IConstants {
    String INVENTORY = "/inventories";
    String ADD_INVENTORY_ITEM = "/add";
    String GET_INVENTORY_ITEMS_BY_ITEM_ID = "/getInventoryItemsByInventoryId/{inventoryItemId}";
    String GET_INVENTORY_ITEMS_BY_PRODUCT_ID = "/getInventoryItemsByProductId/{productId}";
    String GET_INVENTORY_ITEMS_BY_MERCHANT_ID = "/getInventoryItemsByMerchantId/{merchantId}";
    String DELETE_INVENTORY_ITEM = "/delete/{inventoryItemId}";
    String UPDATE_INVENTORY_ITEM = "/update";
    String INVENTORY_TABLE = "inventory";
    String UPDATE_INVENTORY_ITEM_QUANTITY = "/updateQuantity";
}

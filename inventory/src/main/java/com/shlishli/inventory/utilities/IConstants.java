package com.shlishli.inventory.utilities;

public interface IConstants {
    String INVENTORY = "/inventory";
    String ADD_INVENTORY_ITEM = "/add";
    String GET_INVENTORY_ITEMS_BY_ITEM_ID = "/getInventoryItems/{inventoryItemId}";
    String GET_INVENTORY_ITEMS_BY_PRODUCT_ID = "/getInventoryItems/{productId}";
    String GET_INVENTORY_ITEMS_BY_MERCHANT_ID = "/getInventoryItems/{merchantId}";
    String DELETE_INVENTORY_ITEM = "/delete/{inventoryItemId}";
    String UPDATE_INVENTORY_ITEM = "/update";
    String INVENTORY_TABLE = "inventory";
    String UPDATE_INVENTORY_ITEM_QUANTITY = "/updateQuantity";
}

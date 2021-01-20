package com.example.api.data.junction.VO;

import com.example.api.data.junction.entity.Inventory;
import com.example.api.data.junction.entity.Merchant;
import com.example.api.data.junction.entity.Product;

public class CustomerCartDetails {
    public Product product;
    public Merchant merchant;
    public Integer quantity;
    public double price;
    public Inventory inventory;
    public Long cartId;

}

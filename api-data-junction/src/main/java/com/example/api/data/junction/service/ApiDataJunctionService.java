package com.example.api.data.junction.service;

import com.example.api.data.junction.VO.ProductPageDetails;
import com.example.api.data.junction.VO.ProductPageMerchantDetails;
import com.example.api.data.junction.VO.ResponseTemplate;
import com.example.api.data.junction.entity.Inventory;
import com.example.api.data.junction.entity.Merchant;
import com.example.api.data.junction.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ApiDataJunctionService {

    @Autowired
    RestTemplate restTemplate;



    public Product test(){
        Product product = restTemplate.getForObject("http://API-GATEWAY/products/getProductDetails/6", Product.class);
        return product;
    }

    public ResponseTemplate getProductDetails(int productId){

        ResponseTemplate responseTemplate = new ResponseTemplate(true);
        // responseTemplate.success = true;

        ProductPageDetails productPageDetails = new ProductPageDetails();
        List<Inventory> inventories;

        Product product = restTemplate.getForObject("http://PRODUCT-SERVICE/products/getProductDetails/"+productId, Product.class);
        ResponseEntity<Inventory[]> responseEntity= restTemplate.getForEntity("http://INVENTORY-SERVICE/inventories/getInventoryItemsByProductId/"+productId, Inventory[].class);
        inventories = Arrays.asList(responseEntity.getBody());

        int inventoriesSize = inventories.size();

        List<Merchant> merchants = new ArrayList<>();

        for (Inventory inventory : inventories) {
            System.out.println(inventory.getMerchantId());
            Merchant merchant = restTemplate.getForObject("http://MERCHANT-SERVICE/merchants/getMerchantDetails/" + inventory.getMerchantId(), Merchant.class);
            merchants.add(merchant);
        }
        List<ProductPageMerchantDetails> productPageMerchantDetails = new ArrayList<>();


        for(int i = 0;i<inventoriesSize;i++){
            ProductPageMerchantDetails productPageMerchantDetails1 = new ProductPageMerchantDetails();
            Inventory inventory = inventories.get(i);
            Merchant merchant = merchants.get(i);

            productPageMerchantDetails1.merchantId = merchant.getMerchantId();
            productPageMerchantDetails1.merchantName = merchant.getFirstName()+" "+merchant.getLastName();
            productPageMerchantDetails1.price = inventory.getPrice();
            productPageMerchantDetails1.quantity = inventory.getQuantity();
            productPageMerchantDetails1.inventoryItemId = inventory.getInventoryItemId();
            productPageMerchantDetails.add(productPageMerchantDetails1);
        }
        productPageDetails.product = product;


        productPageDetails.merchantDetails = productPageMerchantDetails;
        responseTemplate.data = productPageDetails;
        return responseTemplate;

    }
}

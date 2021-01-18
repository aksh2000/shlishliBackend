package com.example.api.data.junction.service;


import com.example.api.data.junction.entity.Merchant;
import com.example.api.data.junction.methods.ProductPageMethods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApiDataJunctionTestService {

    @Autowired
    ProductPageMethods productPageMethods;

    public Merchant testMerchant(){
        Merchant merchant = productPageMethods.getMerchantDetails((long) 5);
        return merchant;
    }
}

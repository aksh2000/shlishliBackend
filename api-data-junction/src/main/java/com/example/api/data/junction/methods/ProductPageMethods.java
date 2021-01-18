package com.example.api.data.junction.methods;

import com.example.api.data.junction.entity.Merchant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public  class ProductPageMethods {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    public void setRestTemplate(RestTemplate restTemplate){
        System.out.println("setting rest template");
        if(restTemplate==null){
            System.out.println("Resttemplate value is null");
        }
        this.restTemplate = restTemplate;
    }

    public  Merchant getMerchantDetails(Long merchantId){
        Merchant merchant = restTemplate.getForObject("http://MERCHANT-SERVICE/merchants/getMerchantDetails/"+merchantId, Merchant.class);
        return merchant;

    }
}

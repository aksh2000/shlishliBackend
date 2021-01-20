package com.shlishli.merchant.controller;

import com.shlishli.merchant.entity.Merchant;
import com.shlishli.merchant.service.MerchantService;
import com.shlishli.merchant.utilities.IConstants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping(IConstants.MERCHANTS)
public class MerchantController {
    

    @Autowired
    MerchantService merchantService;

    @PostMapping(IConstants.ADD_MERCHANT)
    public Merchant registerMerchant(@RequestBody Merchant merchant){
        return merchantService.registerMerchant(merchant);
    }

    @GetMapping(IConstants.GET_MERCHANT_DETAILS)
    public Optional<Merchant> findCustomerById(@PathVariable("merchantId") Long merchantId){
        return merchantService.findMerchantById(merchantId);    
    }

    @GetMapping(IConstants.GET_MERCHANT_DETAILS_BY_FIREBASE_ID)
    public Merchant findByFirebaseMerchantId(@PathVariable("firebaseMerchantId") String firebaseMerchantId)
    {
        return merchantService.findByFirebaseMerchantId(firebaseMerchantId);}
}

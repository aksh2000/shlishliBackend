package com.example.api.data.junction.controller;


import com.example.api.data.junction.VO.ResponseTemplate;
import com.example.api.data.junction.entity.Merchant;
import com.example.api.data.junction.entity.Product;
import com.example.api.data.junction.service.ApiDataJunctionService;
import com.example.api.data.junction.service.ApiDataJunctionTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/apiJunction")
public class ApiDataJunctionController {

    @Autowired
    private ApiDataJunctionService apiDataJunctionService;


    @Autowired
    private ApiDataJunctionTestService apiDataJunctionTestService;

    @GetMapping("/test")
    public String stringTest(){
        return "This is string test.";
    }

    @GetMapping(value = "/testProduct")
    public Product test(){
        return apiDataJunctionService.test();
    }

    @GetMapping(value = "/testMerchant")
    public Merchant testMerchant(){
        return apiDataJunctionTestService.testMerchant();
    }

    @GetMapping(value = "/getProductDetails/{productId}")
    public ResponseTemplate getProductDetails(@PathVariable("productId") int productId){
        return apiDataJunctionService.getProductDetails(productId);
    }

    @GetMapping(value = "/getTopProducts")
    public ResponseTemplate getTopProducts(){
        return apiDataJunctionService.getTopProducts();
    }

    @GetMapping(value = "/getProductsByCategoryId/{categoryId}")
    public ResponseTemplate getProductsByCategoryId(@PathVariable("categoryId") Long categoryId){
        return apiDataJunctionService.getProductsByCategoryId(categoryId);
    }

    @GetMapping(value = "/getCartDetails/{customerId}")
    public ResponseTemplate getCartDetails(@PathVariable("customerId") Long customerId){
        return apiDataJunctionService.getCartDetails(customerId);
    }

    @GetMapping(value="/getOrderDetailsByCustomerId/{customerId}")
    public ResponseTemplate getOrderDetailsByCustomerId(@PathVariable("customerId") Long customerId ){
        return apiDataJunctionService.getOrderDetailsByCustomerId(customerId);
    }

    @GetMapping(value="/getOrderDetailsByMerchantId/{merchantId}")
    public ResponseTemplate getOrderDetailsByMerchantId(@PathVariable("merchantId") Long merchantId ){
        return apiDataJunctionService.getOrderDetailsByMerchantId(merchantId);
    }

}

package com.example.cloud.gateway;

import com.example.cloud.ResponseTemplate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    ResponseTemplate responseTemplate = new ResponseTemplate(false);

    @GetMapping("/customerServiceFallBack")
    public ResponseTemplate customerServiceFallBackMethod(){
        responseTemplate.setError("Customer Service is taking longer than expected.. Please try later");
        return responseTemplate;
    }

    @GetMapping("/departmentServiceFallBack")
    public ResponseTemplate departmentServiceFallBackMethod(){
        responseTemplate.setError("Department Service is taking longer than expected.. Please try later");
        return responseTemplate;
    }
    @GetMapping("/merchantServiceFallBack")
    public ResponseTemplate merchantServiceFallBackMethod(){
        responseTemplate.setError("Merchant Service is taking longer than expected.. Please try later");
        return responseTemplate;
    }


    @GetMapping("/productServiceFallBack")
    public ResponseTemplate productServiceFallBackMethod(){
        responseTemplate.setError("Product Service is taking longer than expected.. Please try later");
        return responseTemplate;
    }

    @GetMapping("/categoryServiceFallBack")
    public ResponseTemplate categoryServiceFallBackMethod(){
        responseTemplate.setError("Category Service is taking longer than expected.. Please try later");
        return responseTemplate;
    }

    @GetMapping("/ordersServiceFallBack")
    public ResponseTemplate ordersServiceFallBackMethod(){
        responseTemplate.setError("Order Service is taking longer than expected.. Please try later");
        return responseTemplate;
    }

    @GetMapping("/userActivityServiceFallBack")
    public ResponseTemplate userActivityServiceFallBackMethod(){
        responseTemplate.setError("UserActivity Service is taking longer than expected.. Please try later");
        return responseTemplate;
    }

    @GetMapping("/cartServiceFallBack")
    public ResponseTemplate cartServiceFallBackMethod(){
        responseTemplate.setError("Cart Service is taking longer than expected.. Please try later");
        return responseTemplate;
    }

    @GetMapping("/inventoryServiceFallBack")
    public ResponseTemplate inventoryServiceFallBackMethod(){
        responseTemplate.setError("Inventory Service is taking longer than expected.. Please try later");
        return responseTemplate;
    }

    @GetMapping("/apiJunctionServiceFallBack")
    public ResponseTemplate apiJunctionServiceFallBackMethod(){
        responseTemplate.setError("ApiJunction Service is taking longer than expected.. Please try later");
        return responseTemplate;
    }

}

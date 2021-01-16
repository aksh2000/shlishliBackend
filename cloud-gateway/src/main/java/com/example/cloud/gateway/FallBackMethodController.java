package com.example.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/customerServiceFallBack")
    public String customerServiceFallBackMethod(){
        return "Customer Service is taking longer than expected.. Please try later";
    }

    @GetMapping("/departmentServiceFallBack")
    public String departmentServiceFallBackMethod(){
        return "Department Service is taking longer than expected.. Please try later";
    }
    @GetMapping("/merchantServiceFallBack")
    public String merchantServiceFallBackMethod(){
        return "Merchant Service is taking longer than expected.. Please try later";
    }


    @GetMapping("/productServiceFallBack")
    public String productServiceFallBackMethod(){
        return "Product Service is taking longer than expected.. Please try later";
    }

    @GetMapping("/categoryServiceFallBack")
    public String categoryServiceFallBackMethod(){
        return "Category Service is taking longer than expected.. Please try later";
    }

    @GetMapping("/ordersServiceFallBack")
    public String ordersServiceFallBackMethod(){
        return "Orders Service is taking longer than expected.. Please try later";
    }

    @GetMapping("/userActivityServiceFallBack")
    public String userActivityServiceFallBackMethod(){
        return "User_Activity Service is taking longer than expected.. Please try later";
    }

    @GetMapping("/cartServiceFallBack")
    public String cartServiceFallBackMethod(){
        return "Cart Service is taking longer than expected.. Please try later";
    }

    @GetMapping("/inventoryServiceFallBack")
    public String inventoryServiceFallBackMethod(){
        return "Inventory Service is taking longer than expected.. Please try later";
    }

}

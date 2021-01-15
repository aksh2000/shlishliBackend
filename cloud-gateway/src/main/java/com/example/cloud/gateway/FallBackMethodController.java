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

}

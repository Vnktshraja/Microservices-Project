package com.code.cloud.gateway;


import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/userServiceFallBack")
    public String userFallBack(){
        return "User service is taking longer than usual"+"Please try again later";

    }

    @GetMapping("/departmentServiceFallBack")
    public String departmentFallBack(){
        return "Department service is taking longer than usual"+"Please try again later";
    }
}

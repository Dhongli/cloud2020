package com.dai.springcloud;

import com.dai.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "cloud-payment-service",configuration= MySelfRule.class)
public class OrderMainApp80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMainApp80.class, args);
    }
}

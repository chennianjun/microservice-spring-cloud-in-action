package com.base.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboarsApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboarsApplication.class,args);
    }
}

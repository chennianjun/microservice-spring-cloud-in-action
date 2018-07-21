package com.base.cloud;

import com.base.cloud.config.RibbonConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(exclude = RibbonConfiguration.class)
@EnableEurekaClient
@RibbonClient(name = "microservice-provider-user",configuration =RibbonConfiguration.class )
public class SimpleConsumerApplication {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplateBuilder().build();
    }

    public static void main(String[] args) {
        SpringApplication.run(SimpleConsumerApplication.class, args);
    }
}

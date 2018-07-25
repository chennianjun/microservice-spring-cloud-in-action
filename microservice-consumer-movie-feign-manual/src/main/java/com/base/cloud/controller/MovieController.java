package com.base.cloud.controller;

import com.base.cloud.pojo.User;
import com.base.cloud.service.UserFeignClientService;
import feign.Client;
import feign.Contract;
import feign.Feign;
import feign.auth.BasicAuthRequestInterceptor;
import feign.codec.Decoder;
import feign.codec.Encoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.FeignClientsConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@Import(FeignClientsConfiguration.class)
@RestController
public class MovieController {

    private UserFeignClientService userFeignClientService;

    private UserFeignClientService adminFeignClientService;

    public MovieController(Decoder decoder, Encoder encoder, Client client, Contract contract) {
        this.userFeignClientService = Feign.builder().client(client).encoder(encoder).decoder(decoder).contract(contract)
                .requestInterceptor(new BasicAuthRequestInterceptor("user","password")).target(UserFeignClientService.class,"http://microservice-provider-user/");
        this.adminFeignClientService = Feign.builder().client(client).encoder(encoder).decoder(decoder).contract(contract)
                .requestInterceptor(new BasicAuthRequestInterceptor("admin","admin")).target(UserFeignClientService.class,"http://microservice-provider-user/");
    }

    @GetMapping("/user-role/{id}")
    public User findByIdUser(@PathVariable Long id){
        return userFeignClientService.findById(id);
    }

    @GetMapping("/admin-role/{id}")
    public User findByIdAdmin(@PathVariable Long id){
        return adminFeignClientService.findById(id);
    }

}

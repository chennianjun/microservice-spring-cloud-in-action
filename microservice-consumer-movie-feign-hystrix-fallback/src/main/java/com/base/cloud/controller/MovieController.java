package com.base.cloud.controller;

import com.base.cloud.pojo.User;
import com.base.cloud.service.UserFeignClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    @Autowired
    private UserFeignClientService userFeignClientService;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id){
        return userFeignClientService.findById(id);
    }

}

package com.base.cloud.controller;

import com.base.cloud.entity.User;
import com.base.cloud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        return this.userRepository.findOne(id);
    }

    @GetMapping("/get")
    public User get(User user){
        return user;
    }

    @PostMapping("/post")
    public User post(@RequestBody User user){
        return user;
    }

}

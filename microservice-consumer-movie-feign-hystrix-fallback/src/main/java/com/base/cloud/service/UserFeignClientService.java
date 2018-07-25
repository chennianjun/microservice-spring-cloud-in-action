package com.base.cloud.service;

import com.base.cloud.pojo.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "microservice-provider-user",fallback = UserFeignClientService.FeignClientFallback.class)
public interface UserFeignClientService {

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User findById(@PathVariable("id") Long id);

    @Component
    class FeignClientFallback implements UserFeignClientService{

        @Override
        public User findById(Long id) {
            User user=new User();
            user.setId(-1L);
            user.setUsername("默认用户");
            return user;
        }
    }

}

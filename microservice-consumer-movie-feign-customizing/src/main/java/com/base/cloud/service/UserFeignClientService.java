package com.base.cloud.service;

import com.base.cloud.pojo.User;
import com.base.config.FeignConfiguration;
import com.base.config.FooConfiguration;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(name = "microservice-provider-user", configuration = {FeignConfiguration.class})
public interface UserFeignClientService {

    @RequestLine("GET /{id}")
    public User findById(@Param("id") Long id);

}

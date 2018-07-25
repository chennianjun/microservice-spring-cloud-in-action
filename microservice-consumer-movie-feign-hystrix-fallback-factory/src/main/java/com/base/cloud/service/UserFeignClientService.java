package com.base.cloud.service;

import com.base.cloud.pojo.User;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "microservice-provider-user",fallbackFactory = UserFeignClientService.FeignClientFallbackFactory.class)
public interface UserFeignClientService {

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User findById(@PathVariable("id") Long id);

    @Component
    class FeignClientFallbackFactory implements FallbackFactory<UserFeignClientService>{

        private final Logger logger=LoggerFactory.getLogger(FeignClientFallbackFactory.class);

        @Override
        public UserFeignClientService create(Throwable throwable) {
            return (id)->{
                logger.info("fallback;reason was:"+throwable);
                User user=new User();
                user.setId(-1L);
                user.setUsername("默认用户");
                return user;
            };
        }
    }
}

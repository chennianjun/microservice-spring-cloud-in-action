package com.base.cloud.controller;

import com.base.cloud.pojo.User;
import com.base.cloud.service.UserFeignClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MovieController {

    @Autowired
    private UserFeignClientService userFeignClientService;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {
        return userFeignClientService.findById(id);
    }

    /**
     * 测试URL：http://localhost:8010/user/get0?id=1&username=张三
     * 该请求不会成功。
     *
     * @param user user
     * @return 用户信息
     */
    @GetMapping("/user/get0")
    public User get0(User user) {
        return userFeignClientService.get0(user);
    }

    @GetMapping("/user/get1")
    public User get1(User user) {
        return userFeignClientService.get1(user.getId(), user.getUsername());
    }

    @GetMapping("/user/get2")
    public User get2(User user) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", user.getId());
        map.put("username", user.getUsername());
        return userFeignClientService.get2(map);
    }

    @GetMapping("/user/post")
    public User post(User user) {
        return userFeignClientService.get3(user);
    }

}

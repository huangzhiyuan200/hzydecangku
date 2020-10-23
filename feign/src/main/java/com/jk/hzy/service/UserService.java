package com.jk.hzy.service;

import com.jk.hzy.entity.UserEntity;
import com.jk.hzy.service.hystrix.UserServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "provider", fallback = UserServiceHystrix.class)
public interface UserService {

    @RequestMapping("/hello")
    public String hello();

    @RequestMapping("/userList")
    public List<UserEntity> userList();

    @RequestMapping("/userAdd")
    public void userAdd(@RequestBody UserEntity user);

    @RequestMapping("/userDelete")
    public void userDelete(@RequestParam Integer userId);

    @RequestMapping("selectUserById")
    public UserEntity selectUserById(@RequestParam Integer userId);

    @RequestMapping("userUpdate")
    public void userUpdate(@RequestBody UserEntity user);
}

package com.jk.hzy.controller;

import com.jk.hzy.entity.UserEntity;
import com.jk.hzy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/userList")
    public List<UserEntity> userList(){
        return userService.userList();
    }

    @RequestMapping("/userAdd")
    public void userAdd(@RequestBody UserEntity user){
        userService.userAdd(user);
    }

    @RequestMapping("/userDelete")
    public void userDelete(@RequestParam Integer userId){
        userService.userDelete(userId);
    }

    @RequestMapping("selectUserById")
    public UserEntity selectUserById(@RequestParam Integer userId){
        return userService.selectUserById(userId);
    }

    @RequestMapping("userUpdate")
    public void userUpdate(@RequestBody UserEntity user){
        userService.userUpdate(user);
    }

}

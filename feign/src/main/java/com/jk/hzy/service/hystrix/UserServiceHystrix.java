package com.jk.hzy.service.hystrix;

import com.jk.hzy.entity.UserEntity;
import com.jk.hzy.service.UserService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserServiceHystrix implements UserService {

    @Override
    public String hello() {
        return "网络连接异常，请稍后再试！";
    }

    @Override
    public List<UserEntity> userList() {
        return null;
    }

    @Override
    public void userAdd(UserEntity user) {

    }

    @Override
    public void userDelete(Integer userId) {

    }

    @Override
    public UserEntity selectUserById(Integer userId) {
        return null;
    }

    @Override
    public void userUpdate(UserEntity user) {

    }
}

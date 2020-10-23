package com.jk.hzy.service;

import com.jk.hzy.dao.UserMapper;
import com.jk.hzy.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<UserEntity> userList() {
        return userMapper.userList();
    }

    @Override
    public void userAdd(UserEntity user) {
        userMapper.userAdd(user);
    }

    @Override
    public void userDelete(Integer userId) {
        userMapper.userDelete(userId);
    }

    @Override
    public UserEntity selectUserById(Integer userId) {
        return userMapper.selectUserById(userId);
    }

    @Override
    public void userUpdate(UserEntity user) {
        userMapper.userUpdate(user);
    }
}

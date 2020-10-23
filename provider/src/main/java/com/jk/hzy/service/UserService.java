package com.jk.hzy.service;

import com.jk.hzy.entity.UserEntity;

import java.util.List;

public interface UserService {
    List<UserEntity> userList();

    void userAdd(UserEntity user);

    void userDelete(Integer userId);

    UserEntity selectUserById(Integer userId);

    void userUpdate(UserEntity user);
}

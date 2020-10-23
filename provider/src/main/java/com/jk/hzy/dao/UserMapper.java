package com.jk.hzy.dao;

import com.jk.hzy.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {


    List<UserEntity> userList();

    void userAdd(UserEntity user);

    void userDelete(@Param("userId") Integer userId);

    UserEntity selectUserById(@Param("userId")Integer userId);

    void userUpdate(UserEntity user);
}

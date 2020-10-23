package com.jk.hzy.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserEntity implements Serializable {

    private Integer userId;

    private String userName;

    private String password;

    private Integer sex;

}

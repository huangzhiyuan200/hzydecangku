package com.jk.hzy.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;
@Data
public class Order {

    private Integer oederId;

    private String orderNh;

    private String orderName;

    private Integer orderPrice;

    private String orderDate;

    private Integer orderZf;

    private String typeName;


}
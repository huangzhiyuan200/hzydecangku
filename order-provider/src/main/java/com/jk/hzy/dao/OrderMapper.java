package com.jk.hzy.dao;

import com.jk.hzy.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface OrderMapper {
    int deleteByPrimaryKey(Integer oederId);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer oederId);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    List<Order> orderList();

    void OrderDelete(Integer oederId);

    void orderAdd(Order order);

    Order selectOrderById(@Param("oederId") Integer oederId);

    void orderUpdate(Order order);
}
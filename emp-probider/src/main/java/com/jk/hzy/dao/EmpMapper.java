package com.jk.hzy.dao;

import com.jk.hzy.entity.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EmpMapper {
    int deleteByPrimaryKey(Integer empId);

    int insert(Emp record);

    int insertSelective(Emp record);

    Emp selectByPrimaryKey(Integer empId);

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);

    List<Emp> empList();

    Emp selectEmpById(Integer empId);

    void empAdd(Emp emp);

    void empDelete(Integer empId);

    void empUpdate(Emp emp);
}
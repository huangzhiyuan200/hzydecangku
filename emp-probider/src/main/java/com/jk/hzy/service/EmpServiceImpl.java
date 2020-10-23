package com.jk.hzy.service;

import com.jk.hzy.dao.EmpMapper;
import com.jk.hzy.entity.Emp;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("EmpService")
public class EmpServiceImpl implements EmpService {

    @Resource
    private EmpMapper empMapper;

    @Override
    public List<Emp> empList() {
        return empMapper.empList();
    }

    @Override
    public Emp selectEmpById(Integer empId) {
        return empMapper.selectEmpById(empId);
    }

    @Override
    public void empAdd(Emp emp) {
        empMapper.empAdd(emp);
    }

    @Override
    public void empDelete(Integer empId) {
        empMapper.empDelete(empId);
    }

    @Override
    public void empUpdate(Emp emp) {
        empMapper.empUpdate(emp);
    }
}

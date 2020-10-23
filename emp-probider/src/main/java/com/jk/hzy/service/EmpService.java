package com.jk.hzy.service;


import com.jk.hzy.entity.Emp;

import java.util.List;

public interface EmpService {
    List<Emp> empList();

    Emp selectEmpById(Integer empId);

    void empAdd(Emp emp);

    void empDelete(Integer empId);

    void empUpdate(Emp emp);
}

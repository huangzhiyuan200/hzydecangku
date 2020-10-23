package com.jk.hzy.service;

import com.jk.hzy.entity.Emp;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "emp-probider")
public interface EmpService {

    @RequestMapping("empList")
    public List<Emp> empList();

    @RequestMapping("selectEmpById")
    public Emp selectEmpById(@RequestParam Integer empId);

    @RequestMapping("empAdd")
    public void empAdd(@RequestBody Emp emp);

    @RequestMapping("empDelete")
    public void empDelete(@RequestParam Integer empId);

    @RequestMapping("empUpdate")
    public void empUpdate(@RequestBody Emp emp);
}

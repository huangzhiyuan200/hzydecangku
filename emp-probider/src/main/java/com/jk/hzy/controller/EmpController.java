package com.jk.hzy.controller;

import com.jk.hzy.entity.Emp;
import com.jk.hzy.service.EmpService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class EmpController {

    @Resource
    private EmpService empService;

    @RequestMapping("empList")
    public List<Emp> empList(){
        return empService.empList();
    }

    @RequestMapping("selectEmpById")
    public Emp selectEmpById(@RequestParam Integer empId){
        return empService.selectEmpById(empId);
    }

    @RequestMapping("empAdd")
    public void empAdd(@RequestBody Emp emp){
        empService.empAdd(emp);
    }

    @RequestMapping("empDelete")
    public void empDelete(@RequestParam Integer empId){
        empService.empDelete(empId);
    }

    @RequestMapping("empUpdate")
    public void empUpdate(@RequestBody Emp emp){
        empService.empUpdate(emp);
    }
}

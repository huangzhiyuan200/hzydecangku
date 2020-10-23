package com.jk.hzy.controller;

import com.jk.hzy.entity.Emp;
import com.jk.hzy.service.EmpService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class EmpController {

    @Resource
    private EmpService empService;

    @RequestMapping("empList")
    public String empList(Model model){
        List<Emp> emps = empService.empList();
        model.addAttribute("empList",emps);
        return "empList";
    }

    @RequestMapping("selectEmpById")
    public String selectEmpById(@RequestParam Integer empId,Model model){
        model.addAttribute("emp",empService.selectEmpById(empId));
        return "empUpdate";
    }

    @RequestMapping("empAdd")
    public void empAdd(Emp emp){
        empService.empAdd(emp);
    }

    @RequestMapping("quAdd")
    public String quAdd(Model model){
        model.addAttribute("emp",new Emp());
        return "empAdd";
    }

    @RequestMapping("empDelete")
    public String empDelete(@RequestParam Integer empId){
        empService.empDelete(empId);
        return "redirect:empList";
    }

    @RequestMapping("empUpdate")
    public String empUpdate(Emp emp){
        empService.empUpdate(emp);
        return "redirect:empList";
    }
}

package com.jk.hzy.entity;

import lombok.Data;

@Data
public class Emp {
    private Integer empId;

    private String empName;

    private String empType;

    private String empDate;

    private String empGw;

    private String empZz;

    private String typeName;

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    public String getEmpType() {
        return empType;
    }

    public void setEmpType(String empType) {
        this.empType = empType == null ? null : empType.trim();
    }

    public String getEmpDate() {
        return empDate;
    }

    public void setEmpDate(String empDate) {
        this.empDate = empDate == null ? null : empDate.trim();
    }

    public String getEmpGw() {
        return empGw;
    }

    public void setEmpGw(String empGw) {
        this.empGw = empGw == null ? null : empGw.trim();
    }

    public String getEmpZz() {
        return empZz;
    }

    public void setEmpZz(String empZz) {
        this.empZz = empZz == null ? null : empZz.trim();
    }
}
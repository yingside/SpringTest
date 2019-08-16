package com.yingside.po;

import java.util.Date;

public class Employee {
    private int empId;
    private String empName;
    private String empTel;
    private String empEducation;
    private String empBirthday;
//    private Date empBirthday;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpTel() {
        return empTel;
    }

    public void setEmpTel(String empTel) {
        this.empTel = empTel;
    }

    public String getEmpEducation() {
        return empEducation;
    }

    public void setEmpEducation(String empEducation) {
        this.empEducation = empEducation;
    }

    public String getEmpBirthday() {
        return empBirthday;
    }

    public void setEmpBirthday(String empBirthday) {
        this.empBirthday = empBirthday;
    }

    /*public Date getEmpBirthday() {
        return empBirthday;
    }

    public void setEmpBirthday(Date empBirthday) {
        this.empBirthday = empBirthday;
    }*/

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empTel='" + empTel + '\'' +
                ", empEducation='" + empEducation + '\'' +
                ", empBirthday=" + empBirthday +
                '}';
    }
}

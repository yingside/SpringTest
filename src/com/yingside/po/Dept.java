package com.yingside.po;

import java.util.Date;

public class Dept {
    private int deptId;
    private String deptName;
    private String deptInfo;
    private Date deptCreateDate;

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptInfo() {
        return deptInfo;
    }

    public void setDeptInfo(String deptInfo) {
        this.deptInfo = deptInfo;
    }

    public Date getDeptCreateDate() {
        return deptCreateDate;
    }

    public void setDeptCreateDate(Date deptCreateDate) {
        this.deptCreateDate = deptCreateDate;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                ", deptInfo='" + deptInfo + '\'' +
                ", deptCreateDate=" + deptCreateDate +
                '}';
    }
}

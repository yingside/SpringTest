package com.yingside.dao.impl;

import com.yingside.dao.IEmployeeDao;
import com.yingside.po.Employee;
import org.springframework.stereotype.Component;

@Component(value = "empDao")
public class EmployeeDaoImpl implements IEmployeeDao {
    @Override
    public boolean addEmployee(Employee employee) {
        System.out.println("EmployeeDaoImpl.addEmployee");
        return false;
    }
}

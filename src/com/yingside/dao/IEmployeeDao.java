package com.yingside.dao;

import com.yingside.po.Employee;
import org.springframework.stereotype.Component;


public interface IEmployeeDao {
    boolean addEmployee(Employee employee);
}

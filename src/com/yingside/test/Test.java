package com.yingside.test;

import com.yingside.dao.IEmployeeDao;
import com.yingside.po.BeanTest;
import com.yingside.po.Dept;
import com.yingside.po.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        /*
        BeanTest beanTest = (BeanTest)context.getBean("beanTest");
        List<String> list = beanTest.getList();
        for (String s : list) {
            System.out.println("s = " + s);
        }

        System.out.println("=======================");

        Set<Dept> depts = beanTest.getDepts();
        for (Dept dept : depts) {
            System.out.println("dept = " + dept);
        }

        System.out.println("=======================");

        Map<String, Employee> map = beanTest.getMap();
        for (Map.Entry<String, Employee> entry : map.entrySet()) {
            System.out.println("entry.getKey() = " + entry.getKey() + ", entry.getValue()=" + entry.getValue());
        }

        System.out.println("=======================");

        String[] strings = beanTest.getStrings();
        for (String string : strings) {
            System.out.println("string = " + string);
        }
        */

        IEmployeeDao empDao = (IEmployeeDao)context.getBean("empDao");
        empDao.addEmployee(new Employee());
    }
}

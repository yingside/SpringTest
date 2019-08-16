package com.yingside.po;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class BeanTest {
    private List<String> list;
    private Set<Dept> depts;
    private Map<String,Employee> map;
    private String [] strings;

    public Set<Dept> getDepts() {
        return depts;
    }

    public void setDepts(Set<Dept> depts) {
        this.depts = depts;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, Employee> getMap() {
        return map;
    }

    public void setMap(Map<String, Employee> map) {
        this.map = map;
    }

    public String[] getStrings() {
        return strings;
    }

    public void setStrings(String[] strings) {
        this.strings = strings;
    }
}

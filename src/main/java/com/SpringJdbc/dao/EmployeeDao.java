package com.SpringJdbc.dao;

import com.SpringJdbc.entities.Employee;

import java.util.List;

public interface EmployeeDao {
    public int insert(Employee employee);
    public int modify(Employee employee);
    public int delete(int Eid);
    public Employee getOne(int Eid);
    public List<Employee> getAll();
}

package com.SpringJdbc.dao;

import com.SpringJdbc.entities.Employee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapperImpl implements RowMapper<Employee> {
    @Override
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        Employee emp = new Employee();
        emp.setEid(rs.getInt(1));
        emp.setName(rs.getString(2));
        emp.setSalary(rs.getInt(3));
        emp.setCompany(rs.getString(4));
        return emp;
    }
}

package com.SpringJdbc.dao;

import com.SpringJdbc.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao {

    @Autowired
 private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insert(Employee employee) {
        String sql = "INSERT INTO empdetails(eid, name, salary, company) VALUES(?, ?, ?, ?)";
        int res = this.jdbcTemplate.update(sql, employee.getEid(), employee.getName(), employee.getSalary(), employee.getCompany());
        return res;
    }

    @Override
    public int modify(Employee employee) {
        String sql = "UPDATE empdetails SET salary = ?, company = ? WHERE Eid = ?";
        int res = this.jdbcTemplate.update(sql,employee.getSalary(),employee.getCompany(),employee.getEid());
        return res;
    }

    @Override
    public int delete(int Eid) {
        String sql = "DELETE FROM empdetails WHERE Eid = ?";
        int res = this.jdbcTemplate.update(sql,Eid);
        return res;
    }

    @Override
    public Employee getOne(int Eid) {
        String sql = "SELECT * FROM empdetails WHERE Eid = ?";
        RowMapper<Employee> rowmapper = new RowMapperImpl();
        Employee employee = this.jdbcTemplate.queryForObject(sql,rowmapper,Eid);
        return employee;
    }

    @Override
    public List<Employee> getAll() {
        String sql = "SELECT * FROM empdetails";
        List<Employee> employees = this.jdbcTemplate.query(sql,new RowMapperImpl());
        return employees;
    }
}

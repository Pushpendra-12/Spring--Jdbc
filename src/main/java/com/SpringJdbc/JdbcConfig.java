package com.SpringJdbc;

import com.SpringJdbc.dao.EmployeeDao;
import com.SpringJdbc.dao.EmployeeDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = "com.SpringJdbc.dao")
public class JdbcConfig {
    @Bean("data")
    public DataSource getData(){
        DriverManagerDataSource data = new DriverManagerDataSource();
        data.setDriverClassName("com.mysql.cj.jdbc.Driver");
        data.setUrl("jdbc:mysql://localhost:3306/employee");
        data.setUsername("root");
        data.setPassword("abc123");
        return data;
    }

    @Bean("temaplate")
    public JdbcTemplate getTemplate(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(getData());
        return  jdbcTemplate;
    }

//    @Bean("employeeDao")
//    public EmployeeDao getEmployeeDao(){
//        EmployeeDaoImpl employeeDao = new EmployeeDaoImpl();
//        employeeDao.setJdbcTemplate(getTemplate());
//        return employeeDao;
//    }
}

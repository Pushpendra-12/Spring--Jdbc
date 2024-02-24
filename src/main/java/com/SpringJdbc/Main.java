package com.SpringJdbc;

import com.SpringJdbc.dao.EmployeeDao;
import com.SpringJdbc.dao.EmployeeDaoImpl;
import com.SpringJdbc.entities.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("employeeconfig.xml");
//        EmployeeDao employeeDao = context.getBean("empdao", EmployeeDao.class);

        //Insert
        System.out.println("Program started");
//        Employee employee = new Employee();
//        employee.setEid(4);
//        employee.setName("Pushpit");
//        employee.setSalary(1000);
//        employee.setCompany("NA");
//         int res = employeeDao.insert(employee);
//        System.out.println("Inserted " + res);

        //update
//        Employee employee = new Employee();
//        employee.setCompany("Abc");
//        employee.setSalary(2000);
//        employee.setEid(4);
//        int res = employeeDao.modify(employee);
//        System.out.println("Updated " +res);

        //Delete
//        Employee employee = new Employee();
//        int res = employeeDao.delete(4);
//        System.out.println("Deleted " + res);

        //Selecting
//        Employee employee = employeeDao.getOne(2);
//        System.out.println("getting " + employee);

        //selectint multiple objects


       ApplicationContext context1 = new AnnotationConfigApplicationContext(JdbcConfig.class);
       EmployeeDao employeeDao = context1.getBean("employeeDao",EmployeeDao.class);
        List<Employee> employees = employeeDao.getAll();
        for (Employee emp : employees){
            System.out.println(emp + " ");
        }
    }
}

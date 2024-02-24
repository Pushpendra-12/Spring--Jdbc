package com.SpringJdbc.entities;

public class Employee {
    private int Eid;
    private String name;
    private int salary;
    private String company;

    public Employee() {
    }

    public Employee(int eid, String name, int salary, String company) {
        Eid = eid;
        this.name = name;
        this.salary = salary;
        this.company = company;
    }

    public int getEid() {
        return Eid;
    }

    public void setEid(int eid) {
        Eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Eid=" + Eid +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", company='" + company + '\'' +
                '}';
    }
}

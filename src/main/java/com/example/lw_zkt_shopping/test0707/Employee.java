package com.example.lw_zkt_shopping.test0707;

public class Employee {
    private String name;
    private double Salary;

    public Employee(String name, double salary) {
        this.name = name;
        Salary = salary;
    }

    public double gerAnnual(){
        return  Salary*12;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }
}

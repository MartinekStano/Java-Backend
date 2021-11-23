package com.company;

public class JobPosition {
    private String name;
    private double salary;

    public JobPosition(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }
    public String getName() {return name;}
    public double getSalary() {return salary;}
}

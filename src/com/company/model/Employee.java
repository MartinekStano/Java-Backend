package com.company.model;

public abstract class Employee {

    protected float salary;
    protected int bonus;
    protected EnumEmployee job;

    public Employee(float salary, int bonus, EnumEmployee job) {
        this.salary = salary;
        this.bonus = bonus;
        this.job = job;
    }

    public float getSalary() {
        return salary;
    }

    public int getBonus() {
        return bonus;
    }
    public void getInfo()
    {
        System.out.println(job+"'s salary is "+salary+ " and bonus is "+bonus);
    }
}

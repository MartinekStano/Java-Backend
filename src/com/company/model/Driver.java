package com.company.model;

public class Driver extends Employee {

    public Driver(float salary, int bonus) {
        super(salary, bonus, EnumEmployee.DRIVER);
    }
}

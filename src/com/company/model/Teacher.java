package com.company.model;

import com.company.model.Employee;
import com.company.model.EnumEmployee;

public class Teacher extends Employee {


    public Teacher(float salary, int bonus) {
        super(salary, bonus, EnumEmployee.TEACHER);
    }
}

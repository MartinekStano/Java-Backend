package com.company;

import com.company.model.Employee;

import java.lang.reflect.Array;
import java.util.ArrayList;

public interface EmployeeService {
    void totalSalary(ArrayList<Employee> listOfEmployee);
    void totalBonus(ArrayList<Employee> listOfEmployee);
}

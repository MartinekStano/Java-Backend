package com.company;

import com.company.model.Employee;

import java.util.ArrayList;

public class EmployeeInterfaceImpl {
    public static void totalSalary(ArrayList<Employee> listOfEmployee){
        System.out.println(listOfEmployee.stream().
                mapToDouble(Employee::getSalary).
                sum());
    }
    public static void totalBonus(ArrayList<Employee> listOfEmployee){
        System.out.println(listOfEmployee.stream().
                mapToDouble(Employee::getBonus).
                sum());
    }
}

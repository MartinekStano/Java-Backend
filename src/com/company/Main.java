package com.company;

import com.company.model.Driver;
import com.company.model.Employee;
import com.company.model.Programmer;
import com.company.model.Teacher;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> listOfEmployee = new ArrayList<>();
listOfEmployee.add(new Programmer(4100,900));
listOfEmployee.add(new Teacher(2100,400));
listOfEmployee.add(new Driver(3100,600));

EmployeeInterfaceImpl.totalSalary(listOfEmployee);
EmployeeInterfaceImpl.totalBonus(listOfEmployee);
    }
}
package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.Date;



public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> listOfEmployee = new ArrayList<>();
listOfEmployee.add(new Programmer(4100,900));
listOfEmployee.add(new Teacher(2100,400));
listOfEmployee.add(new Driver(3100,600));

listOfEmployee.forEach(Employee::getInfo);
    }
}
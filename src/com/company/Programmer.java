package com.company;

public class Programmer extends Employee {

    public Programmer(float salary, int bonus) {
        super(salary, bonus, EnumEmployee.PROGRAMMER);
    }
    public void getInfo(){
        System.out.println("Programmer's salary is "+(salary+bonus));
    }
}

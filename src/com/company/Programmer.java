package com.company;

public class Programmer {

    private float salary;
    private int bonus;

    public Programmer(float salary, int bonus) {
        this.salary = salary;
        this.bonus = bonus;
    }
    public float getSalary() {
        return salary;
    }

    public int getBonus() {
        return bonus;
    }
    public void getInfo()
    {
        System.out.println("Programmer's salary is "+salary+ " and bonus is "+bonus);
    }
}

package com.company;

public class Student {

    private String name;
    private int age;
    private int budget;

    public Student(String name, int age, int budget) {
        this.name = name;
        this.age = age;
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getBudget() {
        return budget;
    }

    public static int returnBudget(Student[] people) {
        int helper = 0;
        for (Student human : people)
        {
            helper += human.getBudget();
        };
        return helper;
    };
}

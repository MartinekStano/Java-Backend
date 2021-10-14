package com.company;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("John", 21, 23000);
        Student student2 = new Student("Steve", 32, 40000);
        Student student3 = new Student("Martin", 16, 2700);

        Student[] people = {student1, student2, student3};

        for(Student student : people)
        {
            System.out.println("Name: "+student.getName()+", "+"Age: "+student.getAge()+", "+"Budget: "+student.getBudget());
        };
        System.out.println("Budget: "+Student.ReturnBudget(people));
    }
}

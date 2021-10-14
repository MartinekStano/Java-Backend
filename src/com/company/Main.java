package com.company;

public class Main {

    public static void main(String[] args) {
        String name = "John";
        int numberOfStudent = 12345;

        Student student = new Student(name, numberOfStudent);
        System.out.print(student.Name+": "+numberOfStudent);
    }
}

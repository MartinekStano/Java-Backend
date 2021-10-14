package com.company;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("John", 2, 123456, "Legionarska 1, 01001 Zilina");
        Student student2 = new Student("Sam", 5,123457, "Legionarska 2, 01001 Zilina");
        System.out.println(student1.getNumberOfStudent()+", "+student1.getPhoneNumber()+", "+student1.getAddress());
        System.out.println(student2.getNumberOfStudent()+", "+student2.getPhoneNumber()+", "+student2.getAddress());

    }
}

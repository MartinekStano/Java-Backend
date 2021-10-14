package com.company;

public class Student {

    private String name;
    private int numberOfStudent;
    private int phoneNumber;
    private String address;

    public Student(String name, int numberOfStudent, int phoneNumber, String address) {
        this.name = name;
        this.numberOfStudent = numberOfStudent;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
    public String getName() {
        return name;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public int getPhoneNumber(){
        return phoneNumber;
    }

    public String getAddress(){
        return address;
    }
}

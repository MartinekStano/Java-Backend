package com.company;

import java.time.LocalDate;
import java.util.Date;

public class Employee {
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    JobPosition jobPosition;

    public Employee(String name, String surname, String dateOfBirth, JobPosition jobPosition)
    {
        this.name = name;
        this.surname = surname;
        //this.dateOfBirth = dateOfBirth;
        this.jobPosition = jobPosition;
    }
    public String getName() {return name;}
    public String getSurname() {return surname;}
    //public Date getDateOfBirth() {return dateOfBirth;}
    public JobPosition getJobPosition() {return jobPosition;}
}


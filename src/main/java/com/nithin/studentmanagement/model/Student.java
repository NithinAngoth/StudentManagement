package com.nithin.studentmanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "managementstudent")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;
    private String rollnumber;
    private int age;
    private String emailId;
    private int mobileNumber;
    private double CGPA;

    public Student(){

    }

    public Student(String firstName, String lastName, String rollnumber, int age, String emailId, int mobileNumber, double CGPA){
        this.firstName = firstName;
        this.lastName = lastName;
        this.rollnumber = rollnumber;
        this.age = age;
        this.emailId = emailId;
        this.mobileNumber = mobileNumber;
        this.CGPA = CGPA;
    }

    public String toString(){
        return "id" + id + "firstName: " + firstName + ", rollnumber: " + rollnumber + ", age: " + age + ", emailId: " + emailId + ", mobileNumber: " + mobileNumber + ", CGPA: " + CGPA;
    }
}

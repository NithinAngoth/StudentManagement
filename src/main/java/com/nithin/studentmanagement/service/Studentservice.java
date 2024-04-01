package com.nithin.studentmanagement.service;

import java.util.List;

import com.nithin.studentmanagement.model.Student;

public interface Studentservice {
    
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getUpdateById(int id);
    Student updateStudent(Student student);

    void deleteStudentById(int id);

}

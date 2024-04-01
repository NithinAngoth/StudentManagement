package com.nithin.studentmanagement.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nithin.studentmanagement.model.Student;
import com.nithin.studentmanagement.repository.StudentRepository;
import com.nithin.studentmanagement.service.Studentservice;

@Service
public class Studentserviceimpl implements Studentservice {

    private StudentRepository studentrepository;


    public Studentserviceimpl(StudentRepository studentrepository){
        super();
        this.studentrepository = studentrepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentrepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentrepository.save(student);
    }

    @Override
    public Student getUpdateById(int id) {
        return studentrepository.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student) {
        return studentrepository.save(student);
    }

    @Override
    public void deleteStudentById(int id) {
        studentrepository.deleteById(id);
    }
    
}

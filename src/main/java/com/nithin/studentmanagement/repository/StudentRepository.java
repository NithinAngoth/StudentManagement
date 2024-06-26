package com.nithin.studentmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nithin.studentmanagement.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
    
}

package com.nithin.studentmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nithin.studentmanagement.repository.StudentRepository;

import com.nithin.studentmanagement.model.Student;

@SpringBootApplication
public class StudentmanagementApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentmanagementApplication.class, args);
	}
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		// Student student1 = new Student("nitin", "angoth", "S23", 21, "nithin@gmail.com", 1324665789, 7.5);
		// studentRepository.save(student1);

		// Student student2 = new Student("praveen", "kumar", "S24", 21, "preaveen@gmail.com", 1324665732, 7.2);
		// studentRepository.save(student2);

		// Student student3 = new Student("dhanush", "arrivappa", "S25", 21, "Dhanush@gmail.com", 1324664589, 7);
		// studentRepository.save(student3);
	}

}

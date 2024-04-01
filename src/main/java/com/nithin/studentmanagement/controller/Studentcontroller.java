package com.nithin.studentmanagement.controller;

// import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
// import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.nithin.studentmanagement.model.Student;
// import com.nithin.studentmanagement.model.Student;
import com.nithin.studentmanagement.service.Studentservice;

import lombok.Data;

@Data
@Controller
// @RequestMapping("student")
public class Studentcontroller {
    @Autowired
    Studentservice studentservice;

    public Studentcontroller(Studentservice studentservice){
        super();
        this.studentservice = studentservice;
    }

    @GetMapping("/students")
    public String ListStudents(Model model){
        model.addAttribute("students", studentservice.getAllStudents());
        return "students";
    }

    @GetMapping("/students/new")
    public String CreateStudentForm(Model model){
        Student student = new Student();
        model.addAttribute("student", student);
        return "Create_student";
    }

    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student){
        studentservice.saveStudent(student);
        return "redirect:/students";
    }

    @GetMapping("/students/edit/{id}")
    public String updateStudent(@PathVariable int id, Model model){
        model.addAttribute("student", studentservice.getUpdateById(id));
        return "update_student";
    }

    @PostMapping("/students/{id}")
    public String updateStudentId(@PathVariable int id, @ModelAttribute("student") Student student, Model model){
        Student existingStudnet = studentservice.getUpdateById(id);
        existingStudnet.setId(id);
        existingStudnet.setFirstName(student.getFirstName());
        existingStudnet.setLastName(student.getLastName());
        existingStudnet.setRollnumber(student.getRollnumber());
        existingStudnet.setAge(student.getAge());
        existingStudnet.setEmailId(student.getEmailId());
        existingStudnet.setMobileNumber(student.getMobileNumber());
        existingStudnet.setCGPA(student.getCGPA());
        studentservice.updateStudent(existingStudnet);
        return "redirect:/students";

    }

    @GetMapping("/students/{id}")
    public String deleteStudent(@PathVariable int id){
        studentservice.deleteStudentById(id);
        return "redirect:/students";
    }

}

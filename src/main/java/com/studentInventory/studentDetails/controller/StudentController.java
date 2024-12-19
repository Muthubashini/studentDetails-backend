package com.studentInventory.studentDetails.controller;


import com.studentInventory.studentDetails.model.Student;
import com.studentInventory.studentDetails.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/createStudent")
    public Student createStudent(@RequestBody Student student) {

        return studentService.createStudent(student);
    }
}

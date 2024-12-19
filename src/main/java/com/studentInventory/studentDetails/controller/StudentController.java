package com.studentInventory.studentDetails.controller;


import com.studentInventory.studentDetails.model.Student;
import com.studentInventory.studentDetails.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @PostMapping("/createStudent")
    public Student createStudent(@RequestBody Student student) {

        return studentService.createStudent(student);
    }
}

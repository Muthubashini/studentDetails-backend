package com.studentInventory.studentDetails.service;

import com.studentInventory.studentDetails.model.Student;

import java.util.List;

public interface StudentService {
    Student createStudent(Student student);

    List<Student> getAllStudents();
}

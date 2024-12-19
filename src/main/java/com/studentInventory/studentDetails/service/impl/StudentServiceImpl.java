package com.studentInventory.studentDetails.service.impl;

import com.studentInventory.studentDetails.model.Student;
import com.studentInventory.studentDetails.repository.StudentRepository;
import com.studentInventory.studentDetails.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student createStudent(Student student) {
        studentRepository.save(student);
        return student;
    }
}

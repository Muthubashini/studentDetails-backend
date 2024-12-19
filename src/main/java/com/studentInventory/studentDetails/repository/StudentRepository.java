package com.studentInventory.studentDetails.repository;

import org.springframework.stereotype.Repository;
import com.studentInventory.studentDetails.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}

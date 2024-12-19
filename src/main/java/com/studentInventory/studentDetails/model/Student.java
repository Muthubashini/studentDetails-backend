package com.studentInventory.studentDetails.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

//import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Table(name = "student")

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;

    @Column(name="studentCode")
    private String studentCode;

    @Column(name="studentName")
    private String studentName;

    @Column(name="studentAge")
    private int studentAge;

    @Column(name="studentNIC")
    private String studentNIC;
}


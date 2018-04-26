package com.arun.service;

import com.arun.entities.Student;
import com.arun.model.RequestStudent;

import java.util.Optional;

/**
 * Created by Adwiti on 4/25/2018.
 */
public interface StudentService {
    Student createAStudent(RequestStudent student);
    Optional<Student> getAStudent(Long id);
}

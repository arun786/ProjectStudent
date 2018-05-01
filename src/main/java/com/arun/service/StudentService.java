package com.arun.service;

import com.arun.entities.Student;
import com.arun.model.RequestStudent;

import java.util.List;

/**
 * Created by Adwiti on 4/25/2018.
 */
public interface StudentService {
    Student createAStudent(RequestStudent student);
    Student getAStudent(Long id);
    List<Student> getAllStudent();
    Student updateAStudent(Long id, double fee);
}

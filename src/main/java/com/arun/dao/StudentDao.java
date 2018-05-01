package com.arun.dao;

import com.arun.entities.Student;
import com.arun.model.RequestStudent;

import java.util.List;
import java.util.Optional;

/**
 * Created by Adwiti on 4/25/2018.
 */
public interface StudentDao {

    Student createAStudent(RequestStudent student);

    Optional<Student> getAStudent(Long id);

    List<Student> getAllStudent();

    Student updateAStudent(Long id, double fee);
}

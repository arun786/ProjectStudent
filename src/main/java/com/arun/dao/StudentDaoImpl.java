package com.arun.dao;

import com.arun.entities.Student;
import com.arun.model.RequestStudent;
import com.arun.repos.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by Adwiti on 4/25/2018.
 */
@Repository
public class StudentDaoImpl implements StudentDao {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student createAStudent(RequestStudent student) {
        Student student1 = new Student(student.getName(),student.getCourse(),student.getFee());
        return studentRepository.save(student1);
    }

    @Override
    public Optional<Student> getAStudent(Long id) {
        return studentRepository.findById(id);
    }
}

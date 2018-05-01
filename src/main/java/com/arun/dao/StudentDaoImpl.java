package com.arun.dao;

import com.arun.entities.Student;
import com.arun.exception.IdNotFoundException;
import com.arun.model.RequestStudent;
import com.arun.repos.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
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
        Student student1 = new Student(student.getName(), student.getCourse(), student.getFee());
        return studentRepository.save(student1);
    }

    @Override
    public Optional<Student> getAStudent(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public List<Student> getAllStudent() {
        return (List<Student>) studentRepository.findAll();
    }

    @Override
    public Student updateAStudent(Long id, double fee) {
        Optional<Student> byId = studentRepository.findById(id);
        Student student = null;
        if (byId.isPresent()) {
            byId.get().setFee(fee);
            student = studentRepository.save(byId.get());
        } else {
            throw new IdNotFoundException("Student Id " + id + " not present");
        }
        return student;
    }

    @Override
    public void deleteAStudent(Long id) {
        Optional<Student> byId = studentRepository.findById(id);
        if (byId.isPresent())
            studentRepository.deleteById(byId.get().getId());
    }
}

package com.arun.service;

import com.arun.dao.StudentDao;
import com.arun.entities.Student;
import com.arun.model.RequestStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by Adwiti on 4/25/2018.
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public Student createAStudent(RequestStudent student) {
        return studentDao.createAStudent(student);
    }

    @Override
    public Optional<Student> getAStudent(Long id) {
        return studentDao.getAStudent(id);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentDao.getAllStudent();
    }
}

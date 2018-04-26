package com.arun.controller;

import com.arun.entities.Student;
import com.arun.model.RequestStudent;
import com.arun.service.StudentService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * Created by Adwiti on 4/25/2018.
 */
@RestController
@Api
public class StudentContoller {

    @Autowired
    private StudentService studentService;

    @PostMapping(value = "/student/v1/student")
    public ResponseEntity<Student> createAStudent(@RequestBody RequestStudent student) {
        Student student1 = studentService.createAStudent(student);
        return new ResponseEntity<Student>(student1, HttpStatus.CREATED);
    }

    @GetMapping("/student/v1/student/{id}")
    public ResponseEntity<Optional<Student>> getAStudent(@PathVariable(value = "id") Long id) {
        Optional<Student> student = studentService.getAStudent(id);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }
}

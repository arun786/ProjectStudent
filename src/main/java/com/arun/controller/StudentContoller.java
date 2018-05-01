package com.arun.controller;

import com.arun.entities.Student;
import com.arun.model.RequestStudent;
import com.arun.service.StudentService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public ResponseEntity<Student> getAStudent(@PathVariable(value = "id") Long id) {
        Student student = studentService.getAStudent(id);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @GetMapping("/student/v1/students")
    public ResponseEntity<List<Student>> getAllStudent() {
        List<Student> student = studentService.getAllStudent();
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @PutMapping("/student/v1/student")
    public ResponseEntity<Student> upDateAStudent(@RequestParam(value = "id") Long id,
                                                  @RequestParam(value = "fee") Double fee) {
        Student student = studentService.updateAStudent(id, fee);
        return new ResponseEntity<Student>(student, HttpStatus.OK);
    }

    @DeleteMapping("/student/v1/student")
    public void deleteAStudent(@RequestParam(value = "id") Long id) {
        studentService.deleteAStudent(id);
    }
}

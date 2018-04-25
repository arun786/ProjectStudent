package com.arun.repos;

import com.arun.entities.Student;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Adwiti on 4/24/2018.
 */
public interface StudentRepository extends CrudRepository<Student,Long> {
}

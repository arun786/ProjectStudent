package com.arun.dao;

import com.arun.entities.Student;
import com.arun.model.RequestStudent;

/**
 * Created by Adwiti on 4/25/2018.
 */
public interface StudentDao {

    Student createAStudent(RequestStudent student);
}

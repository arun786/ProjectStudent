package com.arun.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by Adwiti on 4/24/2018.
 */

@Getter
@Setter
@Entity
@Table(name = "studenttab")
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "sname")
    private String name;
    @Column(name = "scourse")
    private String course;
    @Column(name = "sfee")
    private Double fee;

    public Student(String name, String course, Double fee) {
        this.name = name;
        this.course = course;
        this.fee = fee;
    }
}

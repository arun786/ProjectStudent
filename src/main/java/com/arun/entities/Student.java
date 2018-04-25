package com.arun.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by Adwiti on 4/24/2018.
 */
@Entity
@Getter
@Setter
@Table(name = "studenttab")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "sname")
    private String name;
    @Column(name = "scourse")
    private String course;
    @Column(name = "sfee")
    private Double fee;
}

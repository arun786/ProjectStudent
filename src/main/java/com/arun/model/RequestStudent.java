package com.arun.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by Adwiti on 4/25/2018.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RequestStudent {
    private String name;
    private String course;
    private Double fee;
}

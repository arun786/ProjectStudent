package com.arun.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by Adwiti on 4/30/2018.
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
public class ExceptionResponse {
    private String code;
    private String description;
}

package com.arun.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * Created by Adwiti on 4/30/2018.
 */
@RestController
@ControllerAdvice
public class StudentExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(IdNotFoundException.class)
    public ResponseEntity<ExceptionResponse> getIdNotFoundException(IdNotFoundException e, WebRequest request) {
        ResponseEntity<ExceptionResponse> responseEntity = new ResponseEntity<ExceptionResponse>(
                new ExceptionResponse(HttpStatus.NOT_FOUND.toString(), e.getMessage()), HttpStatus.NO_CONTENT
        );
        return responseEntity;
    }
}

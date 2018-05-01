package com.arun.exception;

/**
 * Created by Adwiti on 4/30/2018.
 */
public class IdNotFoundException extends RuntimeException {
    public IdNotFoundException(String message) {
        super(message);
    }
}

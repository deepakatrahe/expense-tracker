package com.deepak.expensetrackerv1.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT)
public class ItemAlreadyExistsException extends RuntimeException{
    private final static long serialVersionUID = 1L;
    public ItemAlreadyExistsException(String message) {
        super(message);
    }
}

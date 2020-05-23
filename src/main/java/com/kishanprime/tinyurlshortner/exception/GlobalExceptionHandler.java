package com.kishanprime.tinyurlshortner.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.kishanprime.tinyurlshortner.exception.model.ErrorModel;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Nasim Salmany
 */

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorModel> handleError(HttpServletRequest req, Exception e) {
        return new ResponseEntity<>(new ErrorModel(e.getMessage()), HttpStatus.BAD_REQUEST);
    }
}
package com.kishanprime.tinyurlshortner.exception.model;

import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

/**
 * @author Nasim Salmany
 */
public class ErrorModel {

    private String errorMessage;

    public ErrorModel() {
    }

    public ErrorModel(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}

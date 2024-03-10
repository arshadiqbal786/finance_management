package com.financemanagement.exception;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;


public class BlogAPIException extends RuntimeException {

    private HttpStatus status;

    public BlogAPIException(HttpStatus status, String message) {
        super(message);
        this.status = status;
    }

    public HttpStatus getStatus() {
        return status;
    }
}

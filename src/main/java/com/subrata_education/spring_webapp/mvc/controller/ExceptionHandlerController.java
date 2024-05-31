package com.subrata_education.spring_webapp.mvc.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;

// @ControllerAdvice
public class ExceptionHandlerController {

    // @ExceptionHandler(HttpClientErrorException.NotFound.class)
    public ResponseEntity handleNotFoundException() {
        return ResponseEntity.notFound().build();
    }
}

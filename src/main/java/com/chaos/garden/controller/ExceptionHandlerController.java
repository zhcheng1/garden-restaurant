package com.chaos.garden.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Created by zcfrank1st on 6/13/16.
 */
@ControllerAdvice
@Slf4j
public class ExceptionHandlerController {

    @ExceptionHandler(Exception.class)
    public ResponseEntity handlerException(Exception ex) {
        log.error("exception throw , message : " + ex.getMessage());
        return new ResponseEntity(HttpStatus.valueOf(999));
    }
}

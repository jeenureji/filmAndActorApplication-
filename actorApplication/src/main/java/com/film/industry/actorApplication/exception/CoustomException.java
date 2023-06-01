package com.film.industry.actorApplication.exception;

import com.film.industry.actorApplication.dto.ActorDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class CoustomException {

    @ExceptionHandler(ActorIdNotValid.class)
    public ResponseEntity<Object> handleException(){
        ExceptionMessage exceptionMessage =  new ExceptionMessage();
        exceptionMessage.setMessage(" Wrong actor id ");
        exceptionMessage.setLocalDateTime(LocalDateTime.now());
ResponseEntity<Object> entity = new ResponseEntity<>(exceptionMessage, HttpStatus.NOT_ACCEPTABLE);
        return entity;
    }
}

package com.shouryashrey.RMS.Controller.Exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler
    public ResponseEntity<ErrorResponse> exceptionHandler(RuntimeException e) {
        ErrorResponse error = ErrorResponse.builder()
            .message(e.getMessage())
            .status(HttpStatus.INTERNAL_SERVER_ERROR.value())
            .timestamp(Instant.now().getEpochSecond())
            .build();
        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

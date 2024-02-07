package com.patrick.social_network.resources.exception;

import com.patrick.social_network.service.exception.ObjectNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ResourceExceptionHandler {
    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException e, HttpServletRequest request) {
        HttpStatus httpStatus = HttpStatus.OK;
        StandardError error = new StandardError(System.currentTimeMillis(), httpStatus.value(), "Não encontrado", e.getMessage(),
                request.getRequestURI());
        return ResponseEntity.status(httpStatus).body(error);
    }
}

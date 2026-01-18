package com.kadri.AuthApplication.auth.exception;

import com.kadri.AuthApplication.auth.model.ErrorResponse;
import jakarta.security.auth.message.AuthException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    public ResponseEntity<ErrorResponse> handleAuth(AuthException exception){
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                .body(new ErrorResponse(exception.getMessage()));
    }
}

package com.pruebatecnica.exception;

import com.pruebatecnica.domain.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static com.pruebatecnica.util.GeneralUtils.builderResponse;


@RestControllerAdvice
public class GlobalExceptionHandler {

    // Manejo de la excepción CustoException
    @ExceptionHandler(CustomException.class)

    public ResponseEntity <Response<Object>>handleTaskNotFoundException(CustomException ex) {
        Response<Object> response=builderResponse(ex.getUseMsg(), ex.getDevlopMsg(), ex.getStatusCode(), "");

        return new ResponseEntity<>(response, HttpStatus.valueOf(ex.getStatusCode()));
    }

    // Manejo de cualquier otra excepción genérica
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Response<Object>> handleGeneralException(Exception ex) {
        Response<Object> response=builderResponse(
                "Error Inesperado",
                ex.getMessage(),
                HttpStatus.INTERNAL_SERVER_ERROR.value(),
                ""
        );

        return new ResponseEntity<>(response, HttpStatus.valueOf(500));
    }
}

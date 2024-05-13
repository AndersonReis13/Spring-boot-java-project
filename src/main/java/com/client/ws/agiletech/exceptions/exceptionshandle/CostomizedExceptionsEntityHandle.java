package com.client.ws.agiletech.exceptions.exceptionshandle;

import com.client.ws.agiletech.dto.error.ErrorResponseDto;
import com.client.ws.agiletech.exceptions.BadRequestException;
import com.client.ws.agiletech.exceptions.ExceptionsResponse;
import com.client.ws.agiletech.exceptions.ResourceNotFoundExceptions;
import org.hibernate.annotations.NotFound;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
@RestController
public class CostomizedExceptionsEntityHandle{


    @ExceptionHandler(Exception.class)
    public final ResponseEntity<ErrorResponseDto> handleAllExceptions(Exception ex){
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ErrorResponseDto.builder()
                        .message(ex.getMessage())
                        .httpStatus(HttpStatus.INTERNAL_SERVER_ERROR)
                        .timeInstant(new Date())
                        .statusCode(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .build());
    }


    @ExceptionHandler(ResourceNotFoundExceptions.class)
    public final ResponseEntity<ErrorResponseDto> NotFoundRequestException(ResourceNotFoundExceptions ex){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ErrorResponseDto.builder()
                        .timeInstant(new Date())
                        .message(ex.getMessage())
                        .httpStatus(HttpStatus.NOT_FOUND)
                        .statusCode(HttpStatus.NOT_FOUND.value())
                .build());
    }

    @ExceptionHandler(BadRequestException.class)
    public final ResponseEntity<ErrorResponseDto> badRequestException(ResourceNotFoundExceptions ex){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ErrorResponseDto.builder()
                .timeInstant(new Date())
                .message(ex.getMessage())
                .httpStatus(HttpStatus.BAD_REQUEST)
                .statusCode(HttpStatus.BAD_REQUEST.value())
                .build());
    }


    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponseDto> BadRequestException(MethodArgumentNotValidException m){
        Map<String, String> erros = new HashMap<>();

        m.getBindingResult().getAllErrors().forEach(erro ->{
            String fild = ((FieldError) erro).getField();
            String message = erro.getDefaultMessage();
            erros.put(fild, message);
        });

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body( ErrorResponseDto.builder()
                .timeInstant(new Date())
                .message(Arrays.toString(erros.entrySet().toArray()))
                .statusCode(HttpStatus.BAD_REQUEST.value())
                .httpStatus(HttpStatus.BAD_REQUEST)
                .build());
    }

}

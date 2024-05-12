package com.client.ws.agiletech.dto.error;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
public class ErrorResponseDto {

    private Date timeInstant;
    private String message;
    private HttpStatus httpStatus;
    private Integer statusCode;

}

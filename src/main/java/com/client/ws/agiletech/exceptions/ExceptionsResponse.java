package com.client.ws.agiletech.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.DataInput;
import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@Getter
@Setter
public class ExceptionsResponse implements Serializable {

    private Date timeInstant;
    private String message;
    private String detail;
}

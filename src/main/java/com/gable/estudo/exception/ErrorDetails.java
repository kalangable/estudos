package com.gable.estudo.exception;

import lombok.Value;

import java.util.Date;

@Value
public class ErrorDetails {
    private Date timestamp;
    private String message;
    private String details;
}
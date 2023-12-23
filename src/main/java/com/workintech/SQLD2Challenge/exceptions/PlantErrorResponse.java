package com.workintech.SQLD2Challenge.exceptions;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;
@AllArgsConstructor
@ToString
public class PlantErrorResponse {
    private Integer status;
    private String message;
    private LocalDateTime dateTime;
}

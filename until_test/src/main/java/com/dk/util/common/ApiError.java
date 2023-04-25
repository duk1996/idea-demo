package com.dk.util.common;

import lombok.Data;

@Data
public class ApiError extends RuntimeException {
    private String message;
}

package com.dk.util.common;

public class ResourceNotFoundException extends ApiError {
    public ResourceNotFoundException(String message) {
        this.setMessage(message);
    }
}

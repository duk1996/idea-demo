package com.dk.util.common;


import lombok.Data;
import org.springframework.http.HttpEntity;

import java.io.Serializable;

@Data
public class ResponseEntity<T> extends HttpEntity<T> implements Serializable {

    private Integer code;
    private String message;
    private T data;

    public ResponseEntity() {
    }

    public ResponseEntity(T data) {
        this.code = 200;
        this.message = "SUCCESS";
        this.data = data;
    }

    public ResponseEntity(T data, Integer code) {
        this.code = code;
        this.message = "SUCCESS";
        this.data = data;
    }

    public static <T> ResponseEntity<T> ok(T data) {
        return new ResponseEntity<>(data);
    }

    public static <T> ResponseEntity<T> failure() {
        ResponseEntity<T> response = new ResponseEntity<>();
        response.setCode(201);
        response.setMessage("FAILURE");
        return response;
    }

    public static <T> ResponseEntity<T> msg(String message) {
        ResponseEntity<T> response = new ResponseEntity<>();
        response.setMessage(message);
        return response;
    }

    public static <T> ResponseEntity<T> code(Integer code) {
        ResponseEntity<T> response = new ResponseEntity<>();
        response.setCode(code);
        return response;
    }

}

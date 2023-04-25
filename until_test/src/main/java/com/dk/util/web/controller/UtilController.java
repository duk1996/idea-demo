package com.dk.util.web.controller;

import com.dk.util.common.ResponseEntity;
import com.dk.util.service.UtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("/test")
@RestController
public class UtilController {

    @Autowired
    private UtService utService;

    @GetMapping
    public ResponseEntity get() {
        utService.exceptionTest();
        return ResponseEntity.ok(UUID.randomUUID().toString());
    }

    @GetMapping("res")
    public String res() {
//        new ResponseEntity<WebMvcConfig>();
        return UUID.randomUUID().toString();
    }

}

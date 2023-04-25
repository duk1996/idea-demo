package com.dk.util.service;

import com.dk.util.common.ResourceNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UtService {


    public void exceptionTest() {
        throw new ResourceNotFoundException("未找到数据");
    }
}

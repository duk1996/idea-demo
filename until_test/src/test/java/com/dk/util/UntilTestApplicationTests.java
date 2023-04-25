package com.dk.util;

import com.dk.util.config.YamlMapConfig;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class UntilTestApplicationTests {

    @Autowired
    private YamlMapConfig config;

    @Test
    void contextLoads() {
        System.out.println(config.getTest1());
    }

}

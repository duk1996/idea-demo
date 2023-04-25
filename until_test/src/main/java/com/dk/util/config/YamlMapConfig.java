package com.dk.util.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
@ConfigurationProperties(prefix = "test", ignoreUnknownFields = false)
public class YamlMapConfig {
    private Map<String, String> test1;

    public Map<String, String> getTest1() {
        return test1;
    }

    public void setTest1(Map<String, String> test1) {
        this.test1 = test1;
    }
    //    public static class test {
//
//    }
//
//    public Map<String, test> getConfig() {
//        return config;
//    }
//
//    public void setConfig(Map<String, test> config) {
//        this.config = config;
//    }
}

//package com.dk.util.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.method.HandlerTypePredicate;
//import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
////@Configuration
//public class WebMvcConfig implements WebMvcConfigurer {
//    @Override
//    public void configurePathMatch(PathMatchConfigurer configurer) {
////        WebMvcConfigurer.super.configurePathMatch(configurer);
////        configurer.addPathPrefix("api/v1", HandlerTypePredicate.forAnnotation(ApiV1RestController.class));
//        configurer.addPathPrefix("/api/v1", HandlerTypePredicate.forBasePackage("com.dk.util.web.controller"));
//    }
//
//}

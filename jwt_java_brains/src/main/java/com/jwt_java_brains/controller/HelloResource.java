package com.jwt_java_brains.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {
    @GetMapping("/hello")
    public String hello(){
        System.out.println();
        return "Hello World";
    }
}

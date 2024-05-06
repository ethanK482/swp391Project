package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController



public class Test {
    @GetMapping("/hello")
    public String getMethodName() {
        return "hello";
    }
}

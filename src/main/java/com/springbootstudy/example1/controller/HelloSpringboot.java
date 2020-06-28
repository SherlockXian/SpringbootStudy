package com.springbootstudy.example1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringboot {
    @RequestMapping("/hello")
    public String index(){
        return "Hello Springboot!";
    }
}

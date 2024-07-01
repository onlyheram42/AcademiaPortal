package com.onlyh.academiaportal.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class LoginController {
    @GetMapping("helloworld")
    public String HelloWorld(){
        return "Hello World";
    }
}

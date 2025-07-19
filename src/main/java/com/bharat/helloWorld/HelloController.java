package com.bharat.helloWorld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController

{
    @GetMapping("/user")
public User getUser(){

        return new User("Bharat","abc12@gmail.com");
    }
}

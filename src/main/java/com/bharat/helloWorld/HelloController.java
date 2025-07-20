package com.bharat.helloWorld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController

{


    @GetMapping("/hello")
    public String sayHello(){
        return "Hello world !!!";
    }

    @GetMapping("/user")
     public User getUser(){

        return new User("Bharat","abc12@gmail.com");
    }
@GetMapping("/employee")
    public Employee getEmployee(){
        return new Employee("Bharat","abcd@gmail.com");
    }
    @PostMapping("/employee")
    public String createEmployee(@RequestBody Employee emp) {
        return "Employee created: " + emp.getName() + " | " + emp.getEmail();
    }
}

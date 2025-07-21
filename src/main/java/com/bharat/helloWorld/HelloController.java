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

    @GetMapping("/product/{id}")
    public String getProduct(@PathVariable int id){
        return "Product ID Requested :"+id;
    }
    @GetMapping("/search")
    public String searchingProduct(@RequestParam String name){
        return "Searching For : "+name;
    }
 @PutMapping("/product/{id}")
    public String updateProduct(@PathVariable int id, @RequestBody prodcut updateProduct){

        return "product "+id +" updated To"+updateProduct.getName();
    }

    @DeleteMapping("/product/{id}")
    public  String deleteProduct(@PathVariable int id){
        return "Product with ID "+id+" Deleted successfully.";
    }
}

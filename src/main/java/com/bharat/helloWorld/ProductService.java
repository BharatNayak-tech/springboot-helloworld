package com.bharat.helloWorld;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class ProductService {


    public prodcut getProduct(){
        return new prodcut(121.12,5,"pen");
    }

    public String updateProduct(int id){
        return "product ID "+id+" updated sucessfully";
    }

    public String deleteProduct (int id){
        return "product Id "+id+" deleted Successfully";
    }

}

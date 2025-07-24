package com.bharat.helloWorld.day1to5;

import org.springframework.stereotype.Service;

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
